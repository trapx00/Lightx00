package trapx00.lightx00.client.presentation.mainui;

import javafx.event.ActionEvent;
import trapx00.lightx00.client.presentation.approvalui.AuditUiController;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.client.presentation.promotionui.ClientPromotionUiController;
import trapx00.lightx00.client.presentation.promotionui.ComSalePromotionUiController;
import trapx00.lightx00.client.presentation.promotionui.TotalPricePromotionUiController;

public class ManagerUiController extends FrameworkUiController {

    public void initialize() {
        // 必须有。调用基类初始化来初始化基类的元素。
        super.initialize();
        // 如果还需要初始化自己的元素请接着写。
    }

    public void onAuditFunctionClicked(ActionEvent actionEvent) {
        /**
         * 调用父类切换界面方法实现切换界面。
         * 第一个参数是功能Controller（需要实现ExternalLoadableUiController），第二个是标题文字。
         * @see #switchFunction(Class, String, boolean)
         */
        switchFunction(AuditUiController.class, "审批单据", true);
    }

    public void onClientPromotionFunctionClicked(ActionEvent actionEvent) {
        switchFunction(ClientPromotionUiController.class, "制定客户类促销策略",true);
    }



    public void onComSalePromotionFunctionClicked(ActionEvent actionEvent) {
        switchFunction(ComSalePromotionUiController.class, "制定组合商品促销策略", true);
    }

    public void onTotalPricePromotionFunctionClicked(ActionEvent actionEvent) {
        switchFunction(TotalPricePromotionUiController.class, "制定满额类促销策略", true);

    }

    public void onSaleDetailFunctionClicked(ActionEvent actionEvent) {
        switchFunction(AuditUiController.class, "查看经营情况表", true);

    }

    public void onTradeHistoryFunctionClicked(ActionEvent actionEvent) {
        switchFunction(AuditUiController.class, "查看经营历程表", true);

    }

    public void onTradeSituationFunctionClicked(ActionEvent actionEvent) {
        switchFunction(AuditUiController.class, "查看销售情况表", true);

    }
}
