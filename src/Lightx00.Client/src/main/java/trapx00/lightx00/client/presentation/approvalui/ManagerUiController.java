package trapx00.lightx00.client.presentation.approvalui;

import javafx.event.ActionEvent;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.client.presentation.promotionui.ClientPromotionUiController;

public class ManagerUiController extends FrameworkUiController {

    public void initialize() {
        // 必须有。调用基类初始化来初始化基类的元素。
        super.initialize();
        // 如果还需要初始化自己的元素请接着写。
    }

    /**
     * 财务人员独有的制定现金费用单的功能按钮的相应方法。通过调用switchFunction进入对应的功能界面。
     * @see ClientPromotionUiController。功能界面必须实现ExternalLoadableUiController
     * @param actionEvent actionEvent
     */
    public void onClientPromotionFunctionClicked(ActionEvent actionEvent) {
        /**
         * 调用父类切换界面方法实现切换界面。
         * 第一个参数是功能Controller（需要实现ExternalLoadableUiController），第二个是标题文字。
         * @see #switchFunction(Class, String, boolean)
         */
        switchFunction(ClientPromotionUiController.class, "制定现金费用单",true);
    }

    public void onAuditFunctionClicked(ActionEvent actionEvent) {
        switchFunction(AuditUiController.class, "审批单据", true);
    }

    public void onComSalePromotionFunctionClicked(ActionEvent actionEvent) {

    }

    public void onTotalPricePromotionFunctionClicked(ActionEvent actionEvent) {

    }

    public void onSaleDetailFunctionClicked(ActionEvent actionEvent) {

    }

    public void onTradeHistoryFunctionClicked(ActionEvent actionEvent) {

    }

    public void onTradeSituationFunctionClicked(ActionEvent actionEvent) {

    }
}
