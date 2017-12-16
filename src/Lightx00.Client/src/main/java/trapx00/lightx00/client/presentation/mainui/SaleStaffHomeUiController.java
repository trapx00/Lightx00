package trapx00.lightx00.client.presentation.mainui;

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

public class SaleStaffHomeUiController implements ExternalLoadableUiController {
    @FXML
    private Text welcomeText;

    public void initialize() {
        welcomeText.setText(welcomeText.getText() + FrameworkUiManager.getCurrentEmployee().getPosition() + " " + FrameworkUiManager.getCurrentEmployee().getName());
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
    }

    @FXML
    private void onPurchaseBillFunctionClicked(ActionEvent actionEvent) {
    }

    @FXML
    private void onPurchaseRefundBillFunctionClicked(ActionEvent actionEvent) {
    }

    @FXML
    private void onSaleBillFunctionClicked(ActionEvent actionEvent) {
    }

    @FXML
    private void onSaleRefundBillFunctionClicked(ActionEvent actionEvent) {
    }
}
