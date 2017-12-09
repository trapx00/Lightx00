package trapx00.lightx00.client.presentation.commodityui;

import com.jfoenix.controls.JFXTextField;
import trapx00.lightx00.client.presentation.financeui.AddCashBillItemDialog;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadableUiController;
import trapx00.lightx00.client.presentation.helpui.ExternalLoadedUiPackage;
import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;

import java.util.function.Consumer;

public class AddCommodityDialog implements ExternalLoadableUiController{
    public JFXTextField tfId;
    public JFXTextField tfName;
    public JFXTextField tfSort;
    public JFXTextField tfAmount;
    public JFXTextField tfDate;
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
        return null;
    }
}
