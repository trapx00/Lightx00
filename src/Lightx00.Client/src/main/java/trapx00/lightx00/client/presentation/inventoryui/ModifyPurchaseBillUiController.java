package trapx00.lightx00.client.presentation.inventoryui;

import trapx00.lightx00.client.presentation.helpui.PromptDialogHelper;
import trapx00.lightx00.client.presentation.helpui.ReadOnlyPairTableHelper;
import trapx00.lightx00.client.presentation.mainui.FrameworkUiController;
import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;


public class ModifyPurchaseBillUiController extends FrameworkUiController {
    public PurchaseBillPo purchaseBillPo = new PurchaseBillPo("JHD-20171026-00000", null, null, "李四",1,"16125012323","无",200.00,null);

    public void onSubmitButtonClicked() {
        PromptDialogHelper.start("单据详情", null)
                .addCloseButton("确认提交", "DONE", e->submitSuccess())
                .addCloseButton("取消","CLOSE",null)
                .addTable(
                        ReadOnlyPairTableHelper.start()
                                .addPair("单据编号", purchaseBillPo.getId())
                                .addPair("操作员", purchaseBillPo.getOperatorId())
                                .addPair("供应商", purchaseBillPo.getSupplier())
                                .addPair("仓库", purchaseBillPo.getRepository() + "")
                                .addPair("总额合计", purchaseBillPo.getTotal() + "")
                                .addPair("备注", purchaseBillPo.getComment())
                                .create())
                .create(this.dialogContainer)
                .show();
    }

    public void onCancelButtonClicked() {
        PromptDialogHelper.start("是否要存入草稿箱", null)
                .addCloseButton("存入", "DONE", null)
                .addCloseButton("不存入","CLOSE",null)
                .addCloseButton("取消","UNDO",null)
                .create(this.dialogContainer)
                .show();
    }

    public void submitSuccess(){
        PromptDialogHelper.start("提交成功", null)
                .addCloseButton("确定", "DONE", null)
                .create(this.dialogContainer)
                .show();
    }
}

