package trapx00.lightx00.client.presentation.inventoryui.gift;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.DoubleValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import trapx00.lightx00.client.presentation.helpui.*;

import java.util.function.Consumer;

public class InventoryGiftItemModificationUi implements ExternalLoadableUiController {
    public JFXTextField tfAmount;
    private Consumer<Double> callback;

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/gift/InventoryGiftModificationUi.fxml").loadAndGetPackageWithoutException();
    }

    public void show(Consumer<Double> callback) {
        ExternalLoadedUiPackage uiPackage = load();
        InventoryGiftItemModificationUi controller = (InventoryGiftItemModificationUi) uiPackage.getController();
        controller.callback = callback;
        PromptDialogHelper.start("","").setContent(uiPackage.getComponent()).createAndShow();
    }
    @FXML
    private void initialize() {
        DoubleValidator validator = new DoubleValidator();
        validator.setMessage("请输入数字");
        tfAmount.getValidators().add(validator);
        tfAmount.focusedProperty().addListener((o, oldVal, newVal) -> {
            if (!newVal) {
                tfAmount.validate();
            }
        });
    }

    public void onBtnSubmitClicked(ActionEvent actionEvent) {
        if (validate()) {
            if (callback != null) {
                callback.accept(Double.valueOf(tfAmount.getText()));
                close();
            }
        }
    }

    private boolean validate() {
        return tfAmount.validate();
    }

    public void onBtnCancelClicked(ActionEvent actionEvent) {
        close();
    }

    public void close() {
        FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
    }
}
