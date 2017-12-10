package trapx00.lightx00.client.presentation.financeui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;

import java.io.IOException;

public class ReceivalBillUiController implements DraftContinueWritableUiController, ExternalLoadableUiController, ReversibleUi {
    public JFXTextField tfId;
    public JFXTextField tfClient;
    public JFXTextField tfOperator;
    public JFXTreeTableView<TranscationModel> tbTranscations;
    public JFXTreeTableColumn tcBankAccount;
    public JFXTreeTableColumn tcAmount;
    public JFXTreeTableColumn tcComment;
    public JFXButton btnAdd;
    public JFXButton btnDelete;

    /**
     * Start continuing write a draft. Returns a External loaded ui package.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return External loaded ui package including a controller and the component.
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
        return new UiLoader("/fxml/financeui/ReceivalBillUi.fxml").loadAndGetPackageWithoutException();
    }

    /**
     * Revert a reversible.
     *
     * @param reversible reversible
     * @return External loaded ui package including a controller and the component.
     */
    @Override
    public ExternalLoadedUiPackage revertReversible(Reversible reversible) {
        return null;
    }

    public void onBtnAddItemClicked(ActionEvent actionEvent) {

    }

    public void onBtnDeleteItemClicked(ActionEvent actionEvent) {

    }

    public void onTfClientClicked(MouseEvent mouseEvent) {

    }

    public void onBtnAutofillClicked(ActionEvent actionEvent) {

    }

    public void onBtnSubmitClicked(ActionEvent actionEvent) {

    }

    public void onBtnSaveAsDraftClicked(ActionEvent actionEvent) {

    }

    public void onBtnResetClicked(ActionEvent actionEvent) {

    }
}
