package trapx00.lightx00.client.presentation.commodityui;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.DoubleValidator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;

import java.util.Date;
import java.util.function.Consumer;

public class AddCommodityDialog implements ExternalLoadableUiController{
    public JFXTextField tfId;
    public JFXTextField tfName;
    public JFXTextField tfSort;
    public JFXTextField tfAmount;
    public JFXTextField tfBatch;
    public JFXTextField tfBatchNo;
    public JFXTextField tfpurchasePrice;
    public JFXTextField tfretailPrice;
    public JFXTextField tfwarningValue;

    private Consumer<CommodityVo> callback;

    public void show(Consumer<CommodityVo> callback) {
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        AddCommodityDialog dialog = (AddCommodityDialog) externalLoadedUiPackage.getController();
        dialog.callback = callback;
        PromptDialogHelper.start("","").setContent(externalLoadedUiPackage.getComponent()).createAndShow();
    }

    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/commodity/AddCommodityDialog.fxml").loadAndGetPackageWithoutException();
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
        tfpurchasePrice.getValidators().add(validator);
        tfpurchasePrice.focusedProperty().addListener((o, oldVal, newVal) -> {
            if (!newVal) {
                tfpurchasePrice.validate();
            }
        });
        tfretailPrice.getValidators().add(validator);
        tfretailPrice.focusedProperty().addListener((o, oldVal, newVal) -> {
            if (!newVal) {
                tfretailPrice.validate();
            }
        });
        tfwarningValue.getValidators().add(validator);
        tfwarningValue.focusedProperty().addListener((o, oldVal, newVal) -> {
            if (!newVal) {
                tfwarningValue.validate();
            }
        });
    }

    public void onBtnCancelClicked(ActionEvent actionEvent) {
        close();
    }

    private boolean validate() {
        return tfAmount.validate()&&tfpurchasePrice.validate()
                &&tfretailPrice.validate()&&tfwarningValue.validate();
    }

    public void onBtnSubmitClicked(ActionEvent actionEvent) {
        if (validate()) {
            if (callback != null) {
                callback.accept(new CommodityVo(
                        tfId.getText(),
                        tfName.getText(),
                        tfSort.getText(),
                        Double.parseDouble(tfAmount.getText()),
                        new Date(),
                        tfBatch.getText(),
                        tfBatchNo.getText(),
                        Double.parseDouble(tfpurchasePrice.getText()),
                        Double.parseDouble(tfpurchasePrice.getText()),
                        Double.parseDouble(tfretailPrice.getText()),
                        Double.parseDouble(tfretailPrice.getText()),
                        Double.parseDouble(tfwarningValue.getText())
                ));
                close();
            }
        }
    }

    public void close() {
        FrameworkUiManager.getCurrentDialogStack().closeCurrentAndPopAndShowNext();
    }
}
