package trapx00.lightx00.client.presentation.inventoryui;


import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import org.bridj.cpp.std.list;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseBillBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseBillBlServiceFactory;
import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.factory.ClientInfoUiFactory;
import trapx00.lightx00.client.presentation.commodityui.CommoditySelection;
import trapx00.lightx00.client.presentation.financeui.cashbill.CashBillItemModel;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.shared.exception.bl.UncheckedRemoteException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.NoMoreBillException;
import trapx00.lightx00.shared.exception.presentation.NotCompleteException;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;
import trapx00.lightx00.shared.util.DateHelper;

import java.util.Date;

public class PurchaseBillUiController implements DraftContinueWritableUiController, ExternalLoadableUiController, ReversibleUi {

    @FXML
    private JFXTextField tfBillId;
    @FXML
    private JFXTextField tfOperator;
    @FXML
    private JFXTextField tfDate;
    @FXML
    private JFXTextField tfClientId;
    @FXML
    private JFXTextField tfClientName;
    @FXML
    private JFXComboBox<String> cbRepository;
    @FXML
    private JFXTextField tfBillTotal;
    @FXML
    private JFXTextField tfComment;
    @FXML
    private JFXTreeTableView<CommodityItemModel> tbCommodityList;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityIdColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityNameColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityTypeColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityNumberColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityPriceColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityTotalColumn;
    @FXML
    private JFXTreeTableColumn<CommodityItemModel, String> tcCommodityCommentColumn;

    private ObjectProperty<Date> currentDate = new SimpleObjectProperty<>();
    private ObjectProperty<EmployeeVo> currentEmployee = new SimpleObjectProperty<>();
    private PurchaseBillBlService blService = PurchaseBillBlServiceFactory.getInstance();
    private ObservableList<CommodityItemModel> commodityItemModelObservableList = FXCollections.observableArrayList();
    private ClientInfoUi clientInfoUi = ClientInfoUiFactory.getClientInfoUi();
    private CommoditySelection commoditySelection=

    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        PurchaseBillVo purchaseBillVo = (PurchaseBillVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        PurchaseBillUiController purchaseBillUiController = (PurchaseBillUiController) externalLoadedUiPackage.getController();
        purchaseBillUiController.tfBillId.setText(purchaseBillVo.getId());
        purchaseBillUiController.tfOperator.setText(String.format("%s(id: %s)", currentEmployee.getValue().getName(), currentEmployee.getValue().getId()));
        purchaseBillUiController.tfClientId.setText(purchaseBillVo.getClientId());
        purchaseBillUiController.cbRepository.setValue(purchaseBillVo.getRepository() + "");
        purchaseBillUiController.tfBillTotal.setText(purchaseBillVo.getTotal() + "");
        purchaseBillUiController.addCommodityListItems(purchaseBillVo.getCommodityList());
        return externalLoadedUiPackage;
    }

    public void addCommodityListItems(CommodityItem[] commodityItems) {
        for (CommodityItem commodityItem : commodityItems) {
            commodityItemModelObservableList.add(new CommodityItemModel(commodityItem));
        }
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/PurchaseBillUi.fxml").loadAndGetPackageWithoutException();
    }

    public void initialize() {
        currentDate.addListener(((observable, oldValue, newValue) -> {
            tfDate.setText(newValue == null ? "" : DateHelper.fromDate(newValue));
        }));

        currentEmployee.addListener(((observable, oldValue, newValue) -> {
            tfOperator.setText(newValue == null ? "" : String.format("%s(id: %s)", newValue.getName(), newValue.getId()));
        }));

        tcCommodityIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getCommodityId()));
        tcCommodityNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getName()));
        tcCommodityTypeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getType()));
        tcCommodityNumberColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getNumber() + ""));
        tcCommodityPriceColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getPrice() + ""));
        tcCommodityTotalColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getTotal() + ""));
        tcCommodityCommentColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCommodityItemObjectProperty().getComment()));
        TreeItem<CommodityItemModel> root = new RecursiveTreeItem<>(commodityItemModelObservableList, RecursiveTreeObject::getChildren);
        tbCommodityList.setRoot(root);
        tbCommodityList.setShowRoot(false);
        ObservableList<String> stringObservableList = FXCollections.observableArrayList(
                "1", "2", "3"
        );
        cbRepository.setItems(stringObservableList);
        autofill();
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

    @FXML
    private void onClientClicked() {
        clientInfoUi.showClientSelectDialog(x -> {
            tfClientId.setText(x.getId());
            tfClientName.setText(x.getName());
        });
    }


    @FXML
    private void onBtnCancelClicked() {
        PromptDialogHelper.start("是否要存入草稿箱", null)
                .addCloseButton("存入", "DONE", e -> saveAsDraft())
                .addCloseButton("不存入", "CLOSE", e -> FrameworkUiManager.switchBackToHome())
                .addCloseButton("取消", "UNDO", null)
                .createAndShow();
    }

    @FXML
    private void onBtnAddItemClicked() {

    }

    @FXML
    private void onBtnDeleteItemClicked() {

    }

    @FXML
    private void onBtnSubmitClicked() {
        try {
            PurchaseBillVo purchaseBillVo = getCurrentPurchaseBillVo();
            PromptDialogHelper.start("确认单据", "").setContent(
                    purchaseBillVo.billDetailUi().showContent(purchaseBillVo).getComponent())
                    .addCloseButton("确定", "CHECK", e -> {
                        try {
                            blService.submit(purchaseBillVo);
                            PromptDialogHelper.start("提交成功！", "你的单据已经提交成功！")
                                    .addCloseButton("继续填写", "EDIT", e1 -> {
                                        onBtnResetClicked();
                                        autofill();
                                    })
                                    .addCloseButton("返回主界面", "CHECK", e1 -> FrameworkUiManager.switchBackToHome())
                                    .createAndShow();
                        } catch (UncheckedRemoteException e1) {
                            PromptDialogHelper.start("提交失败！", "网络错误。详细信息：\n" + e1.getRemoteException().getMessage())
                                    .addCloseButton("好的", "CHECK", null)
                                    .createAndShow();
                        } catch (IdExistsException e1) {
                            PromptDialogHelper.start("提交失败", "ID已经存在，请重新获取ID！")
                                    .addCloseButton("好的", "CHECK", null)
                                    .createAndShow();
                        }
                    })
                    .addCloseButton("取消", "CLOSE", null)
                    .createAndShow();
        } catch (NotCompleteException ignored) {

        }

    }

    private PurchaseBillVo getCurrentPurchaseBillVo() {
        if (cbRepository.getValue() == null || tfBillTotal.getText().length() == 0) {
            PromptDialogHelper.start("提交失败！", "请先填写完单据。")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
            throw new NotCompleteException();
        }
        return new PurchaseBillVo(
                tfBillId.getText(),
                currentDate.getValue(),
                BillState.Draft,
                tfClientId.getText(),
                Integer.parseInt(cbRepository.getValue()),
                currentEmployee.getValue().getId(),
                tfComment.getText(),
                Double.parseDouble(tfBillTotal.getText()),
                commodityItemModelObservableList.stream().map(CommodityItemModel::toCommodityItem).toArray(CommodityItem[]::new)
        );
    }

    private void autofill() {
        try {
            tfBillId.setText(blService.getId());
            currentDate.setValue(new Date());
            currentEmployee.setValue(FrameworkUiManager.getCurrentEmployee());
        } catch (NoMoreBillException e) {
            PromptDialogHelper.start("ID不够！", "当日ID已经达到99999，无法增加新的单据。")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
        } catch (Exception e) {
            PromptDialogHelper.start("初始化失败！", "请重试！")
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
        }

    }

    @FXML
    private void onBtnSaveAsDraftClicked() {
        saveAsDraft();
    }

    private void saveAsDraft() {
        try {
            blService.saveAsDraft(getCurrentPurchaseBillVo());
            PromptDialogHelper.start("保存草稿成功", "你的单据已经保存为草稿。")
                    .addCloseButton("好的", "CHECK", e -> FrameworkUiManager.switchBackToHome())
                    .createAndShow();
        } catch (NotCompleteException ignored) {
        } catch (UncheckedRemoteException e) {
            PromptDialogHelper.start("提交失败！", "网络错误。详细信息：\n" + e.getRemoteException().getMessage())
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
        } catch (Exception e) {
            PromptDialogHelper.start("提交失败", "错误信息如下：\n" + e.getMessage())
                    .addCloseButton("好的", "CHECK", null)
                    .createAndShow();
        }
    }

    @FXML
    private void onBtnResetClicked() {
        PromptDialogHelper.start("是否要重置", null)
                .addCloseButton("确定", "DONE", e -> reset())
                .addCloseButton("取消", "UNDO", null)
                .createAndShow();
    }

    private void reset(){
        tfComment.clear();
        tfBillTotal.clear();
        tfClientId.clear();
        tfClientName.clear();
        cbRepository.setValue("");
        commodityItemModelObservableList.clear();
    }
}

