package trapx00.lightx00.client.presentation.financeui.paymentandreceival;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import org.bridj.cpp.com.VARIANT;
import trapx00.lightx00.client.bl.financebl.factory.ReceivalBillBlFactory;
import trapx00.lightx00.client.blservice.financeblservice.PaymentAndReceivalBlService;
import trapx00.lightx00.client.blservice.financeblservice.ReceivalBillBlService;
import trapx00.lightx00.client.presentation.adminui.EmployeeSelection;
import trapx00.lightx00.client.presentation.adminui.factory.UserManagementUiFactory;
import trapx00.lightx00.client.presentation.bankaccountui.BankAccountSelection;
import trapx00.lightx00.client.presentation.bankaccountui.factory.BankAccountUiFactory;
import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.factory.ClientInfoUiFactory;
import trapx00.lightx00.client.presentation.financeui.TranscationModel;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.client.vo.financestaff.ReceivalBillVo;
import trapx00.lightx00.client.vo.financestaff.ReceivalPaymentBillVoBase;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.database.NoMoreBillException;
import trapx00.lightx00.shared.exception.presentation.NotCompleteException;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.Transcation;
import trapx00.lightx00.shared.util.BillHelper;
import trapx00.lightx00.shared.util.DateHelper;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

@SuppressWarnings("unchecked")
public abstract class PaymentAndReceivalUiController implements DraftContinueWritableUiController, ExternalLoadableUiController, ReversibleUi {
    public JFXTextField tfId;
    public JFXTextField tfClient;
    public JFXTextField tfOperator;
    public JFXTreeTableView<TranscationModel> tbTranscations;
    public JFXTreeTableColumn<TranscationModel, String> tcBankAccount;
    public JFXTreeTableColumn<TranscationModel, String> tcAmount;
    public JFXTreeTableColumn<TranscationModel, String> tcComment;
    public JFXButton btnAdd;
    public JFXButton btnDelete;
    public Label lbTotal;
    public JFXTextField tfDate;

    protected EmployeeSelection employeeSelection = UserManagementUiFactory.getEmployeeSelectionUi();
    protected PaymentAndReceivalBlService blService;
    protected Class<? extends ReceivalPaymentBillVoBase> voClazz;
    protected ClientInfoUi clientInfoUi = ClientInfoUiFactory.getClientInfoUi();

    protected ObjectProperty<Date> currentDate = new SimpleObjectProperty<>();
    protected ObjectProperty<ClientVo> client = new SimpleObjectProperty<>();
    protected ObjectProperty<EmployeeVo> currentEmployee = new SimpleObjectProperty<>();

    protected ObservableList<TranscationModel> transcationModels = FXCollections.observableArrayList();

    /**
     * Start continuing write a draft. Returns a External loaded ui package.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        return null;
    }

    public PaymentAndReceivalUiController(PaymentAndReceivalBlService service, Class<? extends ReceivalPaymentBillVoBase> voClazz) {
        this.blService = service;
        this.voClazz = voClazz;
    }


    public void initialize() {
        tcBankAccount.setCellValueFactory(cellData -> {
            BankAccountVo bankAccountVo = cellData.getValue().getValue().getBankAccount();
            return new SimpleStringProperty(String.format("%s(id: %d)", bankAccountVo.getName(), bankAccountVo.getId()));
        });

        tcAmount.setCellValueFactory(cellData -> new SimpleStringProperty(BillHelper.toFixed(cellData.getValue().getValue().getPrice())));
        tcComment.setCellValueFactory(cellData -> cellData.getValue().getValue().commentProperty());

        transcationModels.addListener((ListChangeListener<TranscationModel>) c -> {
            lbTotal.setText(BillHelper.toFixed(transcationModels.stream().mapToDouble(TranscationModel::getPrice).sum()));
        });

        client.addListener((observable, oldValue, newValue) -> {
            tfClient.setText(newValue == null ? "" : String.format("%s(id: %s)", newValue.getName(), newValue.getId()));
        });

        currentEmployee.addListener(((observable, oldValue, newValue) -> {
            tfOperator.setText(newValue == null ? "" : String.format("%s(id: %s)", newValue.getName(), newValue.getId()));
        }));

        currentDate.addListener(((observable, oldValue, newValue) -> {
            tfDate.setText(newValue == null ? "" : DateHelper.fromDate(newValue));
        }));

        TreeItem<TranscationModel> root = new RecursiveTreeItem<>(transcationModels, RecursiveTreeObject::getChildren);
        tbTranscations.setRoot(root);
        tbTranscations.setShowRoot(false);
        tbTranscations.setEditable(true);
        tbTranscations.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        addRequiredValidator(tfId,"请点击自动填写信息以填写ID。");
        addRequiredValidator(tfClient, "请点击选择客户");
        addRequiredValidator(tfOperator, "请点击自动填写信息以填充操作员。");
        addRequiredValidator(tfDate, "请点击自动填写信息以填写日期。");

    }

    public void addRequiredValidator(JFXTextField jfxTextField, String message) {
        RequiredFieldValidator fieldValidator =new RequiredFieldValidator();
        fieldValidator.setMessage(message);
        jfxTextField.getValidators().add(fieldValidator);
        jfxTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                jfxTextField.validate();
            }
        });
    }


    /**
     * Revert a reversible.
     *
     * @param reversible reversible
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        return null;
    }

    public void onBtnAddItemClicked() {
        new AddTranscationDialog().show(x -> transcationModels.add(x));
    }

    public void onBtnDeleteItemClicked() {
        try {
            int index = tbTranscations.getSelectionModel().getSelectedIndex();
            transcationModels.remove(index);
        } catch (Exception ignored) {

        }
    }

    public boolean validate() {
        return tfId.validate() & tfClient.validate() & tfOperator.validate() & tfDate.validate();
    }

    public ReceivalPaymentBillVoBase getCurrent() {
        if (validate()) {
            try {
                return voClazz.getDeclaredConstructor(
                    String.class, Date.class, BillState.class, String.class, String.class, Transcation[].class, Double.class)
                    .newInstance(tfId.getId(),
                        currentDate.get(),
                        BillState.Draft,
                        tfClient.getId(),
                        currentEmployee.getValue().getId(),
                        transcationModels.stream().map(TranscationModel::toTranscation).toArray(Transcation[]::new),
                        Double.parseDouble(lbTotal.getText()));
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        } else {
            PromptDialogHelper.start("未填写完成！","请填写完成所有字段！")
                .addCloseButton("好","CHECK",null)
                .createAndShow();
            throw new NotCompleteException();
        }
    }

    public void onTfClientClicked() {
        clientInfoUi.showClientSelectDialog(x -> client.set(x));
    }

    public void onBtnAutofillClicked() {
        try {
            tfId.setText(blService.getId());
            currentDate.setValue(new Date());
            currentEmployee.setValue(FrameworkUiManager.getCurrentEmployee());
        } catch (NoMoreBillException e) {
            PromptDialogHelper.start("ID不够！","当日ID已经达到99999，无法增加新的单据。")
                .addCloseButton("好的","CHECK", null)
                .createAndShow();
        }
    }

    public void onBtnSubmitClicked() {
        try {
            blService.submit(getCurrent());
            PromptDialogHelper.start("提交成功！", "你的单据已经提交成功")
                .addCloseButton("好的", "CHECK", e -> onBtnResetClicked())
                .createAndShow();
        } catch (NotCompleteException ignored) {
        } catch (UncheckedRemoteException e) {
            PromptDialogHelper.start("提交失败！","网络错误。详细信息：\n" + e.getRemoteException().getMessage())
                .addCloseButton("好的","CHECK", null)
                .createAndShow();
        }
    }

    public void onBtnSaveAsDraftClicked() {
        try {
            blService.saveAsDraft(getCurrent());
            PromptDialogHelper.start("保存草稿成功","你的单据已经保存为草稿。")
                .addCloseButton("好的","CHECK", e -> onBtnResetClicked())
                .createAndShow();
        } catch (NotCompleteException ignored) {
        } catch (UncheckedRemoteException e) {
            PromptDialogHelper.start("提交失败！","网络错误。详细信息：\n" + e.getRemoteException().getMessage())
                .addCloseButton("好的","CHECK", null)
                .createAndShow();
        }
    }

    public void onBtnResetClicked() {
        client.set(null);
        currentEmployee.set(null);
        currentDate.set(null);
        tfId.setText("");
        transcationModels.clear();
    }
}
