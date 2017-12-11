package trapx00.lightx00.client.presentation.financeui.paymentandreceival;

import trapx00.lightx00.client.blservice.financeblservice.PaymentAndReceivalBlService;
import trapx00.lightx00.client.blservice.financeblservice.PaymentBillBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.financestaff.PaymentBillVo;
import trapx00.lightx00.client.vo.financestaff.ReceivalPaymentBillVoBase;

import java.io.IOException;

public class PaymentBillUiController extends PaymentAndReceivalUiController {
    public PaymentBillUiController() {
        super(PaymentBillBlServiceFactory.getInstance(), PaymentBillVo.class);
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/PaymentBillUi.fxml").loadAndGetPackageWithoutException();
    }

}
