package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.commoditybl.CommodityInfo;
import trapx00.lightx00.client.bl.commoditybl.factory.CommodityServiceFactory;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.util.BillPoVoConverter;
import trapx00.lightx00.client.bl.util.CommonBillBlController;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.client.datafactory.inventorydataservicefactory.InventoryGiftDataServiceFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryGiftQueryVo;

import java.util.Date;

public abstract class InventoryGiftBlController implements BillApprovalCompleteService,InventoryGiftBlService,NotificationAbandonService,NotificationActivateService,DraftDeleteService,BillPoVoConverter<InventoryGiftPo, InventoryGiftVo> {


    private InventoryGiftDataService dataService= InventoryGiftDataServiceFactory.getService();
    private CommodityInfo commodityInfo= CommodityServiceFactory.getController();

    private CommonBillBlController<InventoryGiftVo, InventoryGiftPo, InventoryGiftQueryVo> commonBillBlController
            = new CommonBillBlController<>(dataService, "库存监控单", this);

    public InventoryGiftVo fromPoToVo(InventoryGiftPo po) {
        return new InventoryGiftVo(po.getId(), po.getDate(), po.getState(), po.getGifts());

    }

    public InventoryGiftPo fromVoToPo(InventoryGiftVo vo) {
        return new InventoryGiftPo(BillType.InventoryBill,vo.getId(), vo.getDate(), vo.getState(),vo.getInventoryBillType(),vo.getGifts());
    }

    /**
     * Submits a GiftBill.
     * @param inventoryGiftVo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage sumbit(InventoryGiftVo inventoryGiftVo) {
        return commonBillBlController.submit(inventoryGiftVo);
    }

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return commonBillBlController.getId();
    }
    /**
     * Gets the giftBill during specified time range
     * @param time
     * @return The bill during specified time range
     */
    @Override
    public InventoryGiftVo getGift(Date time) {
        return null;
    }


    /**
     * Abandons a bill.
     * @param id id for the bill
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return commonBillBlController.abandon(id);
    }
    /**
     *  Activates a bill that has been approved of.
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return commonBillBlController.activate(id);
    }
    /**
     * Deletes a draft.
     *
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return commonBillBlController.deleteDraft(id);
    }

    /**
     * When bill is approved, this method is called to modify the state of the bill.
     *
     * @param billId id for the bill
     * @param state  newState. Only BillState.Approved and BillState.Rejected are allowed.
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState state) {
        return commonBillBlController.approvalComplete(billId, state);
    }

    @Override
    public InventoryGiftVo[] query(InventoryGiftQueryVo inventoryBillQueryVo){
        return null;
    }

}
