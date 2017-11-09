package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.commoditybl.CommodityService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;

public class InventoryWarningBlController implements InventoryWarningBlService,DraftDeleteService,NotificationAbandonService,NotificationActivateService,CommodityService,InventoryBillService {
    /**
     * Submits a Bill.
     * @param bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(InventoryBillVo bill) {
        return null;
    }

    /**
     * Saves a half-completed Bill as a draft.
     * @param bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(InventoryBillVo bill) {
        return null;
    }

    /**
     * Modifys the warning value of the commodity
     * @param id ,the id of the commodity
     * @param modifyWarning
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(String id, double modifyWarning) {
        return null;
    }

    /**
     * Gets the current Bill
     * @return the current BillVo
     */
    @Override
    public InventoryBillVo getCurrentBill() {
        return null;
    }

    /**
     *  Querys a bill
     * @param inventoryBillQueryVo
     * @return InventoryBillVo
     */
    @Override
    public InventoryBillVo[] query(InventoryBillQueryVo inventoryBillQueryVo) {
        return new InventoryBillVo[0];
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
     *  Deletes a draft.
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
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

    /**
     * Query a commodity
     * @return CommodityVo
     */
    @Override
    public CommodityVo[] queryCommodity(CommodityQueryVo commodityQueryVo) {
        return new CommodityVo[0];
    }
    /**
     * Querys inventoryBill
     * @param inventoryBillQueryVo
     * @return  the list of inventoryBIlls that match to the requirement
     */
    @Override
    public InventoryBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo) {
        return new InventoryBillVo[0];
    }
}
