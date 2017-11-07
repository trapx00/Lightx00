package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.commoditybl.CommodityService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;

import javax.xml.crypto.Data;

public class InventoryGiftBlController implements InventoryGiftBlService,NotificationAbandonService,NotificationActivateService,CommodityService {
    /**
     * Submits a GiftBill.
     * @param inventoryGiftVo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage sumbit(InventoryGiftVo inventoryGiftVo) {
        return null;
    }

    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * Gets the giftBill during specified time range
     * @param time
     * @return The bill during specified time range
     */
    @Override
    public InventoryGiftVo getGift(Data time) {
        return null;
    }

    /**
     * Query a commodity
     * @param commodityQueryVo
     * @return CommodityVo that match to the requirement
     */
    @Override
    public CommodityVo[] queryCommodity(CommodityQueryVo commodityQueryVo) {
        return new CommodityVo[0];
    }
    /**
     * Abandons a bill.
     * @param id id for the bill
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return null;
    }
    /**
     *  Activates a bill that has been approved of.
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return null;
    }
}
