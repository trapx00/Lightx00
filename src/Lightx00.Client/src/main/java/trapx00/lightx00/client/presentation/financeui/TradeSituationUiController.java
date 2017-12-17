package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.TreeItem;
import trapx00.lightx00.client.bl.financebl.factory.TradeSituationBlFactory;
import trapx00.lightx00.client.blservice.financeblservice.TradeSituationBlService;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.vo.financestaff.TradeSituationVo;
import trapx00.lightx00.shared.util.BillHelper;
import trapx00.lightx00.shared.util.DateHelper;

import java.time.LocalDate;

@SuppressWarnings("unchecked")
public class TradeSituationUiController implements ExternalLoadableUiController {
    public JFXDatePicker dpStart;
    public JFXDatePicker dpEnd;
    public JFXTreeTableView<TradeSituationItem> tbSituation;
    public JFXTreeTableColumn<TradeSituationItem, String> tcName;
    public JFXTreeTableColumn<TradeSituationItem, String> tcNumber;

    private TradeSituationBlService blService = TradeSituationBlFactory.getController();
    private ObjectProperty<TradeSituationVo> tradeSituation = new SimpleObjectProperty<>();

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/TradeSituationUi.fxml").loadAndGetPackageWithoutException();
    }


    public void initialize() {
        initTable();
    }

    public void initTable() {
        tcName.setCellValueFactory(x -> x.getValue().getValue().nameProperty());
        tcNumber.setCellValueFactory(x -> new SimpleStringProperty(BillHelper.toFixed(x.getValue().getValue().getNumber())));

        tradeSituation.addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                showItem(newValue);
            } else {
                showItem(new TradeSituationVo());
            }
        });
    }

    public void showItem(TradeSituationVo situation) {
        TreeItem<TradeSituationItem> income = new TreeItem<>(new TradeSituationItem("折让后总收入", situation.getSaleIncome() + situation.getCommodityIncome()));
        TreeItem<TradeSituationItem> saleIncome = new TreeItem<>(new TradeSituationItem("销售收入", situation.getSaleIncome()));
        TreeItem<TradeSituationItem> commodityIncome = new TreeItem<>(new TradeSituationItem("商品类收入", situation.getCommodityIncome()));
        commodityIncome.getChildren().add(new TreeItem<>(new TradeSituationItem("报溢收入", situation.getOverflowIncome())));
        commodityIncome.getChildren().add(new TreeItem<>(new TradeSituationItem("成本调价", situation.getIncomeAdjustIncome())));
        commodityIncome.getChildren().add(new TreeItem<>(new TradeSituationItem("进货退货差价", situation.getDifferenceOfSaleAndRefundIncome())));
        commodityIncome.getChildren().add(new TreeItem<>(new TradeSituationItem("未使用的代金券", situation.getUnusedCouponValue())));
        TreeItem<TradeSituationItem> promotion = new TreeItem<>(new TradeSituationItem("折让", situation.getPromotion()));
        income.getChildren().addAll(saleIncome, commodityIncome, promotion);

        TreeItem<TradeSituationItem> cost = new TreeItem<>(new TradeSituationItem("支出", situation.getSaleCost() + situation.getCommodityCost()));
        TreeItem<TradeSituationItem> saleCost = new TreeItem<>(new TradeSituationItem("销售支出", situation.getSaleCost()));
        TreeItem<TradeSituationItem> commodityCost = new TreeItem<>(new TradeSituationItem("商品类支出", situation.getCommodityCost()));
        commodityCost.getChildren().add(new TreeItem<>(new TradeSituationItem("商品报损", situation.getLossCost())));
        commodityCost.getChildren().add(new TreeItem<>(new TradeSituationItem("商品赠出", situation.getGiveawayCost())));
        cost.getChildren().addAll(saleCost, commodityCost);

        TreeItem<TradeSituationItem> profit = new TreeItem<>(new TradeSituationItem("利润", situation.getProfit()));

        TreeItem<TradeSituationItem> root = new TreeItem<>();
        root.getChildren().addAll(income, cost ,profit);

        tbSituation.setRoot(root);
        tbSituation.setShowRoot(false);

    }

    public void onRefreshButtonClicked(ActionEvent actionEvent) {
        LocalDate start = dpStart.getValue();
        LocalDate end = dpEnd.getValue();

        if (start == null || end == null) {
            PromptDialogHelper.start("请选择日期","请选择日期！")
                .addCloseButton("好","CHECK", null)
                .createAndShow();
            return;
        }

        TradeSituationVo query = blService.query(DateHelper.fromLocalDate(start), DateHelper.fromLocalDate(end));
        tradeSituation.set(query);
    }

    public void onExportClicked(ActionEvent actionEvent) {

    }
}
