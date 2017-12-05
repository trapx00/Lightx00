package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.financestaff.CashBillVo;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.util.DateHelper;

import java.io.IOException;

/**
 * 财务人员的制定现金费用单UIController。
 * DraftContinueWritableUiController：草稿继续填写UI
 * ExternalLoadableUiController：是功能UI
 * ReversibleUi：红冲UI
 */
public class CashBillUiController implements DraftContinueWritableUiController, ExternalLoadableUiController, ReversibleUi {

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

    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        /**
         * 草稿功能实现。
         * 和对应单据详细界面一样，通过传入的参数初始化对应的控件元素信息。
         */
        CashBillVo cashBillVo = (CashBillVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        CashBillUiController cashBillDetailUiController = (CashBillUiController) externalLoadedUiPackage.getController();
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

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/CashBillUi.fxml").loadAndGetPackageWithoutException();
    }

    /**
     * Revert a reversible.
     *
     * @param reversible reversible
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        /**
         * 红冲功能实现。
         * 和草稿继续填写差不多，但是需要：
         * 1. 重新获取ID（因为红冲单子其实是一张新的UI单子）
         * 2. 取反数量。
         */
        return null;
    }
}
