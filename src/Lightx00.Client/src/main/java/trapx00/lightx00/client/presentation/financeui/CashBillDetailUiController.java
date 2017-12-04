package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.presentation.helpui.BillDetailUi;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.util.DateHelper;

public class CashBillDetailUiController extends BillDetailUi {
    public JFXTextField tfBillState;
    public JFXTextField tfBankaccountId;
    public JFXTextField tfOperator;
    public JFXTextField tfDate;
    public JFXTextField tfId;
    public JFXTreeTableView<CashBillItemModel> tbCashBillItems;
    public JFXTreeTableColumn<CashBillItemModel, String> tcName;
    public JFXTreeTableColumn<CashBillItemModel, String> tcPrice;
    public JFXTreeTableColumn<CashBillItemModel, String> tcComment;

    private ObservableList<CashBillItemModel> cashBillItemModelObservableList = FXCollections.observableArrayList();

    @Override
    public ExternalLoadedUiPackage showContent(BillVo arg) {
        CashBillVo cashBillVo = (CashBillVo) arg;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        CashBillDetailUiController cashBillDetailUiController = (CashBillDetailUiController) externalLoadedUiPackage.getController();
        cashBillDetailUiController.tfId.setText(cashBillVo.getId());
        cashBillDetailUiController.tfDate.setText(DateHelper.fromDate(cashBillVo.getDate()));
        cashBillDetailUiController.tfBankaccountId.setText(cashBillVo.getAccountId());
        cashBillDetailUiController.tfBillState.setText(cashBillVo.getState().toString());
        cashBillDetailUiController.tfOperator.setText(cashBillVo.getOperatorId());
        cashBillDetailUiController.addCashBillItems(cashBillVo.getItems());
        return externalLoadedUiPackage;
    }

    public void addCashBillItems(CashBillItem[] cashBillItems) {
        for (CashBillItem cashBillItem : cashBillItems) {
            cashBillItemModelObservableList.add(new CashBillItemModel(cashBillItem));
        }

    }

    public void initialize() {
        tcName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCashBillItemObjectProperty().getName()));
        tcPrice.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getValue().getCashBillItemObjectProperty().getAmount())));
        tcComment.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getValue().getCashBillItemObjectProperty().getComment()));
        TreeItem<CashBillItemModel> root = new RecursiveTreeItem<>(cashBillItemModelObservableList, RecursiveTreeObject::getChildren);
        tbCashBillItems.setRoot(root);
        tbCashBillItems.setShowRoot(false);

    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/CashBillDetailUi.fxml").loadAndGetPackageWithoutException();
    }

    public void onBtnBackClicked(ActionEvent actionEvent) {
        onClose();
    }
}
