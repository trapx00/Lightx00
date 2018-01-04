package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import trapx00.lightx00.client.bl.financebl.factory.TradeHistoryBlFactory;
import trapx00.lightx00.client.blservice.financeblservice.TradeHistoryBlService;
import trapx00.lightx00.client.presentation.clientui.ClientInfoUi;
import trapx00.lightx00.client.presentation.clientui.factory.ClientInfoUiFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.financestaff.TradeHistoryQueryVo;
import trapx00.lightx00.client.vo.financestaff.TradeHistoryVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.util.DateHelper;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TradeHistoryUiController implements ExternalLoadableUiController {
    public JFXDatePicker dpStart;
    public JFXDatePicker dpEnd;
    public JFXTextField tfClient;
    public JFXTextField tfBillType;
    public JFXTextField tfRepository;
    public JFXButton btnUpdate;
    public JFXButton btnRevert;
    public JFXTreeTableView<BillTableItemModel> tbBill;
    public JFXTreeTableColumn<BillTableItemModel, String> tcBillType;
    public JFXTreeTableColumn<BillTableItemModel, String> tcId;
    public JFXTreeTableColumn<BillTableItemModel, String> tcDate;
    public JFXTreeTableColumn<BillTableItemModel, String> tcOperator;
    public JFXTreeTableColumn<BillTableItemModel, String> tcState;
    public JFXButton exportButton;
    public JFXButton detailButton;
    public JFXCheckBox cbFilter;
    private ObservableList<BillTableItemModel> billTableItemModels = FXCollections.observableArrayList();
    private ClientInfoUi clientInfoUi = ClientInfoUiFactory.getClientInfoUi();

    private ObjectProperty<ClientVo> client = new SimpleObjectProperty<>();
    private ObjectProperty<List<BillType>> billTypes = new SimpleObjectProperty<>();

    private TradeHistoryBlService blService = TradeHistoryBlFactory.getController();

    public void initialize() {
        initTable();
    }

    public void initTable() {
        tcDate.setCellValueFactory(cellData -> new SimpleStringProperty(DateHelper.fromDate(cellData.getValue().getValue().getDate())));
        tcBillType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getType().toString()));
        tcId.setCellValueFactory(cellData -> cellData.getValue().getValue().idProperty());
        tcOperator.setCellValueFactory(cellData -> {
            EmployeeVo operator = cellData.getValue().getValue().getOperator();
            if (operator != null) {
                return new SimpleStringProperty(String.format("%s(id: %s)", operator.getName(), operator.getId()));
            } else {
                return new SimpleStringProperty("");
            }

        });
        tcState.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getState().toString()));
        TreeItem<BillTableItemModel> root = new RecursiveTreeItem<>(billTableItemModels, RecursiveTreeObject::getChildren);
        tbBill.setRoot(root);
        tbBill.setShowRoot(false);
        tbBill.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                TreeItem<BillTableItemModel> selectedItem = tbBill.getSelectionModel().getSelectedItem();
                showDetail(selectedItem.getValue());
            }
        });

        client.addListener((observable, oldValue, newValue) -> {
            tfClient.setText(newValue == null ? "" : String.format("%s(id: %s)", newValue.getName(), newValue.getId()));
        });
        billTypes.addListener((observable, oldValue, newValue) -> {
            tfBillType.setText(newValue == null ? "" : (
                newValue.size() == 1 ? newValue.get(0).toString()
                    : String.format("选择了%s项种类", newValue.size())
                ));
        });
    }

    public void showDetail(BillTableItemModel model) {
        if (model != null) {
            BillVo selected = model.getBill();
            PromptDialogHelper.start("单据详细信息","")
                    .setContent(selected.billDetailUi().showContent(selected).getComponent())
                    .addCloseButton("好","CHECK",null)
                    .createAndShow();
        } else {
            PromptDialogHelper.start("错误","请至少选一个条目。")
                .addCloseButton("好的","DONE",null)
                .createAndShow();
        }
    }

    public void updateItems() {
        billTableItemModels.clear();
        TradeHistoryQueryVo queryVo = new TradeHistoryQueryVo();
        if (cbFilter.isSelected()) {
            LocalDate startDate = dpStart.getValue();
            LocalDate endDate = dpEnd.getValue();
            if (startDate != null && endDate != null) {
                queryVo.setStart(DateHelper.fromLocalDate(startDate));
                queryVo.setEnd(DateHelper.fromLocalDate(endDate));
            }

            if (client.get() != null) {
                queryVo.setClientIds(new String[] {client.get().getId()});
            }

            if (billTypes.get() != null && billTypes.get().size() != 0) {
                queryVo.setBillTypes(billTypes.get().toArray(new BillType[billTypes.get().size()]));
            }
        }
        TradeHistoryVo tradeHistoryVo = blService.query(queryVo);
        billTableItemModels.addAll(Arrays.stream(tradeHistoryVo.getBills()).map(BillTableItemModel::new).collect(Collectors.toList()));
    }

    public BillVo getSelected() {
        try {
            return tbBill.getSelectionModel().getSelectedItem().getValue().getBill();
        } catch (NullPointerException e){
            return null;
        }

    }

    public void onRefreshButtonClicked(ActionEvent actionEvent) {
        updateItems();
    }

    public void onRevertClicked(ActionEvent actionEvent) {
        BillVo selected = getSelected();

        if (selected != null) {
            if (selected instanceof Reversible) {
                Reversible reversible = (Reversible) selected;
                FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
                FrameworkUiManager.switchFunction(reversible.reversibleUi().revertReversible(reversible), "红冲", true);
            } else {
                PromptDialogHelper.start("您所选的单据不可红冲！","您所选的单据不可红冲！")
                    .addCloseButton("好","CHECK",null)
                    .createAndShow();
            }

        } else {
            PromptDialogHelper.start("错误","请至少选一个条目。")
                .addCloseButton("好的","DONE",null)
                .createAndShow();
        }
    }

    public void onExportClicked(ActionEvent actionEvent) {
        PromptDialogHelper.start("导出成功","已经导出到C:\\233.xlsx。")
                .addCloseButton("去看看","FORWARD",null)
                .addCloseButton("完成","DONE",null)
                .createAndShow();
    }

    public void onDetailClicked(ActionEvent actionEvent) {
        showDetail(tbBill.getSelectionModel().getSelectedItem().getValue());
    }

    public void onClientClicked(MouseEvent mouseEvent) {
        clientInfoUi.showClientSelectDialog(x -> client.set(x));
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/TradeHistoryUi.fxml").loadAndGetPackageWithoutException();
    }

    public void onTypeClicked(MouseEvent mouseEvent) {
        new BillTypeSelectionDialog().show(billTypes.getValue(), list -> billTypes.set(list));
    }

    public void onBtnClearFilterClicked(ActionEvent actionEvent) {
        dpStart.setValue(null);
        dpEnd.setValue(null);
        client.setValue(null);
        billTypes.setValue(null);
    }
}
