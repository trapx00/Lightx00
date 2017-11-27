package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.commoditybl.CommodityService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;
import trapx00.lightx00.shared.po.bill.BillState;

import java.util.Date;

public class InventoryWarningBlController implements BillApprovalCompleteService, InventoryWarningBlService,DraftDeleteService,NotificationAbandonService,NotificationActivateService,CommodityService,InventoryBillService {
    /**
     * Submits a Bill.
     * @param bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(InventoryBillVo bill) {
        return ResultMessage.Success;
    }

    /**
     * Saves a half-completed Bill as a draft.
     * @param bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(InventoryBillVo bill) {
        return ResultMessage.Success;
    }

    /**
     * Modifys the warning value of the commoditybl
     * @param id ,the id of the commoditybl
     * @param modifyWarning
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(String id, double modifyWarning) {
        return ResultMessage.Success;
    }

    /**
     * Gets the current Bill
     * @return the current BillVo
     */
    @Override
    public InventoryBillVo getCurrentBill() {
        InventoryBillVo inventoryBillVo=new InventoryBillVo("123",new Date(), BillState.Approved,null,null,null,null);
        return inventoryBillVo;
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
        return "123";
    }

    /**
     *  Deletes a draft.
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return ResultMessage.Success;
    }

    /**
     * Abandons a bill.
     * @param id id for the bill
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return ResultMessage.Success;
    }

    /**
     *  Activates a bill that has been approved of.
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return ResultMessage.Success;
    }

    /**
     * Query a commoditybl
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

    /**
     * When bill is approved, this method is called to modify the state of the bill.
     *
     * @param billId id for the bill
     * @param state  newState. Only BillState.Approved and BillState.Rejected are allowed.
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState state) {
        return null;
    }

}
