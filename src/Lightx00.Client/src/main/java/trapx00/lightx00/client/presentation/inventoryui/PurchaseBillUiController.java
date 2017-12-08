package trapx00.lightx00.client.presentation.inventoryui;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import trapx00.lightx00.client.presentation.helpui.*;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.Reversible;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

import java.io.IOException;


public class PurchaseBillUiController implements DraftContinueWritableUiController, ExternalLoadableUiController, ReversibleUi {

    public JFXTextField tfBillId;
    public JFXTextField tfOperatorId;
    public JFXTextField tfClientId;
    public JFXComboBox<Integer> tfRepository;
    public JFXTextField tfBillTotal;
    public JFXTextField tfComment;
    public JFXTextField tfCommodityId;
    public JFXComboBox<String> cbCommodityName;
    public JFXComboBox<String> cbCommodityType;
    public JFXTextField tfCommodityNumber;
    public JFXTextField tfCommodityPrice;
    public JFXTextField tfCommodityTotal;
    public JFXTextField tfCommodityComment;
    public JFXTreeTableColumn<CommodityItemModel, String> tcCommodityNameColumn;
    public JFXTreeTableColumn<CommodityItemModel, Double> tcCommodityNumberColumn;
    public JFXTreeTableColumn<CommodityItemModel, Double> tcCommodityTotalColumn;

    private CommodityVo commodityVo;

    /**
     * Start continuing write a draft. Returns a ExternalLoadableUiController. It can be used to set the stage without casting to specific ui controller.
     * Overrides to return a specific ui controller.
     *
     * @param draft draft
     * @return a ExternalLoadableUiController
     */
    @Override
    public ExternalLoadedUiPackage continueWriting(Draftable draft) {
        PurchaseBillVo purchaseBillVo = (PurchaseBillVo) draft;
        ExternalLoadedUiPackage externalLoadedUiPackage = load();
        PurchaseBillUiController purchaseBillUiController = (PurchaseBillUiController) externalLoadedUiPackage.getController();
        purchaseBillUiController.tfBillId.setText(purchaseBillVo.getId());
        purchaseBillUiController.tfOperatorId.setText(purchaseBillVo.getOperatorId());
        return null;
    }

    /**
     * Loads the controller.
     *
     * @return external loaded ui controller and component
     */
    @Override
    public ExternalLoadedUiPackage load() {
        return new UiLoader("/fxml/inventoryui/PurchaseBillUi.fxml").loadAndGetPackageWithoutException();
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

    public void onDraftFunctionButtonClicked() {

    }

    public void onSubmitButtonClicked() {
        /*PromptDialogHelper.start("单据详情", null)
                .addCloseButton("确认提交", "DONE", e -> submitSuccess())
                .addCloseButton("取消", "CLOSE", null)
                .addTable(
                        ReadOnlyPairTableHelper.start()
                                .addPair("单据编号", purchaseBillPo.getId())
                                .addPair("操作员", purchaseBillPo.getOperatorIds())
                                .addPair("供应商", purchaseBillPo.getSupplier())
                                .addPair("仓库", purchaseBillPo.getRepository() + "")
                                .addPair("总额合计", purchaseBillPo.getTotal() + "")
                                .addPair("备注", purchaseBillPo.getComment())
                                .create())
                .create(this.dialogContainer)
                .show();*/
    }

    public void onCancelButtonClicked() {
        /*PromptDialogHelper.start("是否要存入草稿箱", null)
                .addCloseButton("存入", "DONE", null)
                .addCloseButton("不存入", "CLOSE", null)
                .addCloseButton("取消", "UNDO", null)
                .create(this.dialogContainer)
                .show();*/
    }

    public void submitSuccess() {
        /*PromptDialogHelper.start("提交成功", null)
                .addCloseButton("确定", "DONE", null)
                .create(this.dialogContainer)
                .show();*/
    }
}

