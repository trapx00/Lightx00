package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.util.CommonBillBlController;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.client.datafactory.inventorydataservicefactory.InventoryWarningDataServiceFactory;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryDetailBillVo;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryDetailBillPo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;

import java.util.Date;

public class InventoryWarningBlController implements BillApprovalCompleteService, InventoryWarningBlService,DraftDeleteService,NotificationAbandonService,NotificationActivateService {

    private InventoryWarningDataService dataService= InventoryWarningDataServiceFactory.getService();

    private CommonBillBlController<InventoryDetailBillVo, InventoryDetailBillPo, InventoryBillQueryVo> commonBillBlController
            = new CommonBillBlController<>(dataService, "现金费用单", this::voToPo, this::poToVo);

    private InventoryBillQueryVo poToVo(InventoryDetailBillPo po) {
        CommodityVo[] commodityVos={};
        CommodityPo[] commodityPos=po.getCommodityIdList();
        int i=0;
        for(CommodityPo commodityPo:commodityPos){
            commodityVos[i++]=CommodityVo.commodityPotoVo(commodityPo);
        }
        return new InventoryDetailBillVo(po.getId(), po.getDate(), po.getState(), po.getOperatorId(), commodityVos, po.getItems());

    }

    private CashBillPo voToPo(CashBillVo vo) {
        return new CashBillPo(vo.getId(), vo.getDate(), vo.getState(), vo.getOperatorId(), vo.getAccountId(), vo.getItems());
    }
    /**
     * Submits a Bill.
     * @param bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(InventoryDetailBillVo bill) {
        return ResultMessage.Success;
    }

    /**
     * Saves a half-completed Bill as a draft.
     * @param bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(InventoryDetailBillVo bill) {
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
    public InventoryDetailBillVo getCurrentBill() {
        InventoryDetailBillVo inventoryDetailBillVo =new InventoryDetailBillVo("123",new Date(), BillState.Approved,null,null,null,null);
        return inventoryDetailBillVo;
    }

    /**
     *  Querys a bill
     * @param inventoryBillQueryVo
     * @return InventoryDetailBillVo
     */
    @Override
    public InventoryDetailBillVo[] query(InventoryBillQueryVo inventoryBillQueryVo) {
        return new InventoryDetailBillVo[0];
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
     * Querys inventoryBill
     * @param inventoryBillQueryVo
     * @return  the list of inventoryBIlls that match to the requirement
     */

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
