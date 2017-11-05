package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillVo;

public interface InventoryWarningBlService {
    //库存监控

    /**
     * Submits a bill
     * @param bill
     * @return  whether the operation is done successfully
     */
    ResultMessage submit(InventoryBillVo bill);//提交

    /**
     * Saves the current bil
     * @param bill
     * @return  whether the operation is done successfully
     */
    ResultMessage saveAsDraft(InventoryBillVo bill);//保存草稿

    /**
     *  Modifys the warning value of the commodity
     * @param id
     * @param modifyWarning
     * @return  whether the operation is done successfully
     */
    ResultMessage modify(String id, double modifyWarning);//修改警戒值

    /**
     * Gets the current Bill
     * @return the current BillVo
     */
    InventoryBillVo getCurrentBill();//得到正在操作单据信息
    /**
     *  Querys a bill
     * @param inventoryBillQueryVo
     * @return InventoryBillVo
     */
    InventoryBillVo []query(InventoryBillQueryVo inventoryBillQueryVo);
    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId();

}