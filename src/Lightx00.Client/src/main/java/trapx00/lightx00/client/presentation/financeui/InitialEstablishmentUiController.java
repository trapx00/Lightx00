package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import trapx00.lightx00.client.bl.financebl.factory.InitialEstablishmentBlFactory;
import trapx00.lightx00.client.blservice.financeblservice.InitialEstablishmentBlService;
import trapx00.lightx00.client.presentation.bankaccountui.BankAccountModel;
import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.UiLoader;
import trapx00.lightx00.client.vo.Draftable;

import java.io.IOException;

public class InitialEstablishmentUiController implements DraftContinueWritableUiController, ExternalLoadableUiController {
    public JFXTextField tfId;
    public JFXTextField tfDate;
    public JFXTextField tfOperator;
    @FXML
    private JFXTreeTableView<BankAccountModel> tableBankAccounts;
    @FXML private JFXTreeTableColumn<BankAccountModel, Integer> tcBankId;
    @FXML private JFXTreeTableColumn<BankAccountModel, String> tcBankName;
    @FXML private JFXTreeTableColumn<BankAccountModel, Double> tcBankBalance;

    private InitialEstablishmentBlService blService = InitialEstablishmentBlFactory.getController();

    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        return null;
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/financeui/InitialEstablishmentUi.fxml").loadAndGetPackageWithoutException();
    }

    public void onBtnSubmitClicked(ActionEvent actionEvent) {

    }


    public void onBtnResetClicked(ActionEvent actionEvent) {

    }

    public void onBtnCancelClicked(ActionEvent actionEvent) {

    }

    public void onBtnAutofillClicked(ActionEvent actionEvent) {

    }
}
