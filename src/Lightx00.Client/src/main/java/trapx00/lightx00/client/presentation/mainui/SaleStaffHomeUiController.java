package trapx00.lightx00.client.presentation.mainui;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import trapx00.lightx00.client.presentation.clientui.ClientUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.FrameworkUiManager;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.presentation.inventoryui.PurchaseBillUiController;
import trapx00.lightx00.client.presentation.inventoryui.PurchaseRefundBillUiController;
import trapx00.lightx00.client.presentation.saleui.SaleBillUiController;
import trapx00.lightx00.client.presentation.saleui.SaleRefundBillUiController;
import trapx00.lightx00.shared.util.DateHelper;

public class SaleStaffHomeUiController extends FrameworkUiController implements ExternalLoadableUiController {
    @FXML
    private Text welcomeText;

    @FXML
    private Text welcomeTimeText;

    @FXML
    private JFXButton notificationButton;

    @FXML
    private JFXButton draftButton;

    public void initialize() {
        welcomeText.setText(welcomeText.getText() + FrameworkUiManager.getCurrentEmployee().getPosition() + " " + FrameworkUiManager.getCurrentEmployee().getName());
        welcomeTimeText.setText(welcomeTimeText.getText() + DateHelper.fromTimestamp(System.currentTimeMillis()));
        draftButton.setText("8");
        notificationButton.setText("12");
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/mainui/SaleStaffHomeUi.fxml").loadAndGetPackageWithoutException();
    }

    @FXML
    private void onClientFunctionClicked(ActionEvent actionEvent) {
        FrameworkUiManager.switchFunction(ClientUiController.class, "管理客户", true);
    }

    @FXML
    private void onPurchaseBillFunctionClicked(ActionEvent actionEvent) {
        FrameworkUiManager.switchFunction(PurchaseBillUiController.class, "制定进货单", true);
    }

    @FXML
    private void onPurchaseRefundBillFunctionClicked(ActionEvent actionEvent) {
        FrameworkUiManager.switchFunction(PurchaseRefundBillUiController.class, "制定进货退货单", true);
    }

    @FXML
    private void onSaleBillFunctionClicked(ActionEvent actionEvent) {
        FrameworkUiManager.switchFunction(SaleBillUiController.class, "制定销售单", true);
    }

    @FXML
    private void onSaleRefundBillFunctionClicked(ActionEvent actionEvent) {
        FrameworkUiManager.switchFunction(SaleRefundBillUiController.class, "制定销售退货单", true);
    }
}
