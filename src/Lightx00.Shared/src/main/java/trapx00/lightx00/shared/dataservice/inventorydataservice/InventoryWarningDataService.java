package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;

public interface InventoryWarningDataService {
    /**
     * Submits a bill
     * @param bill
     * @return  whether the operation is done successfully
     */
    ResultMessage submit(InventoryBillPo bill);

    /**
     *  Modifys the warning value of the commodity
     * @param id
     * @param warningValue
     * @return  whether the operation is done successfully
     */
    ResultMessage modify(String id, double warningValue);//修改警戒值
    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    String getId();

    /**
     * Gets the Bill
     * @param ids
     * @return the bill
     */
    InventoryBillPo[] getAlarmByIds(String... ids);//提供报警
    /**
     * Gets the Bill
     * @param ids
     * @return the bill
     */
    InventoryBillPo[] getOverflowByIds(String... ids);//提供报溢
    /**
     * Gets the Bill
     * @param ids
     * @return the bill
     */
    InventoryBillPo[] getLossByIds(String... ids);//提供报损

    void init();
}
