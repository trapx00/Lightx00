package trapx00.lightx00.client.presentation.financeui;

import javafx.event.ActionEvent;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;


/**
 * 财务人员的边框控制器。继承FrameworkUiController。
 * 记得在FXML文件里设置对应这个类。
 */
public class FinanceStaffUiController extends FrameworkUiController {



    public void initialize() {
        // 必须有。调用基类初始化来初始化基类的元素。
        super.initialize();
        // 如果还需要初始化自己的元素请接着写。
    }

    /**
     * 财务人员独有的制定现金费用单的功能按钮的相应方法。通过调用switchFunction进入对应的功能界面。
     * @see CashBillUiController。功能界面必须实现ExternalLoadableUiController
     * @param actionEvent actionEvent
     */
    public void onCashBillFunctionClicked(ActionEvent actionEvent) {
        /**
         * 调用父类切换界面方法实现切换界面。
         * 第一个参数是功能Controller（需要实现ExternalLoadableUiController），第二个是标题文字。
         * @see #switchFunction(Class, String)
         */
        switchFunction(CashBillUiController.class, "制定现金费用单");
    }
}
