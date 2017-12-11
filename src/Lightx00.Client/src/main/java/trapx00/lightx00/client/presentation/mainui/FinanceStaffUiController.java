package trapx00.lightx00.client.presentation.mainui;

import javafx.event.ActionEvent;
import trapx00.lightx00.client.presentation.bankaccountui.BankAccountUiController;
import trapx00.lightx00.client.presentation.financeui.cashbill.CashBillUiController;
import trapx00.lightx00.client.presentation.financeui.paymentandreceival.PaymentBillUiController;
import trapx00.lightx00.client.presentation.financeui.paymentandreceival.ReceivalBillUiController;


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
     * @see CashBillUiController 。功能界面必须实现ExternalLoadableUiController
     * @param actionEvent actionEvent
     */
    public void onCashBillFunctionClicked(ActionEvent actionEvent) {
        /**
         * 调用父类切换界面方法实现切换界面。
         * 第一个参数是功能Controller（需要实现ExternalLoadableUiController），第二个是标题文字。
         * @see #switchFunction(Class, String, boolean)
         */
        switchFunction(CashBillUiController.class, "制定现金费用单",true);
    }

    public void onReceivalBillFunctionClicked(ActionEvent actionEvent) {
        switchFunction(ReceivalBillUiController.class, "制定付款单",true);
    }

    public void onPaymentBillFunctionClicked(ActionEvent actionEvent) {
        switchFunction(PaymentBillUiController.class, "制定收款单",true);
    }

    public void onSaleDetailFunctionClicked(ActionEvent actionEvent) {
        
    }

    public void onTradeHistoryFunctionClicked(ActionEvent actionEvent) {

    }

    public void onTradeSituationFunctionClicked(ActionEvent actionEvent) {

    }

    public void onBankAccountFunctionClicked(ActionEvent actionEvent) {
        switchFunction(BankAccountUiController.class, "银行账户管理", true);
    }
}
