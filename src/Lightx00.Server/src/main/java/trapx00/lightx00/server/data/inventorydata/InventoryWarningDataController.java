package trapx00.lightx00.server.data.inventorydata;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillQueryVo;

public class InventoryWarningDataController implements InventoryWarningDataService{
    /**
     * Submits a bill
     * @param bill
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(InventoryBillPo bill) {
        return null;
    }
    /**
     *  Modifys the warning value of the commodity
     * @param id
     * @param warningValue
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(String id, double warningValue) {
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
     * Gets the Bill
     * @param ids
     * @return the bill
     */
    @Override
    public InventoryBillPo[] getAlarmByIds(String... ids) {
        return new InventoryBillPo[0];
    }
    /**
     * Gets the Bill
     * @param ids
     * @return the bill
     */
    @Override
    public InventoryBillPo[] getOverflowByIds(String... ids) {
        return new InventoryBillPo[0];
    }
    /**
     * Gets the Bill
     * @param ids
     * @return the bill
     */
    @Override
    public InventoryBillPo[] getLossByIds(String... ids) {
        return new InventoryBillPo[0];
    }
    /**
     *  Querys a bill
     * @param inventoryBillQueryVo
     * @return InventoryBillVo
     */
    @Override
    public InventoryBillPo[] query(InventoryBillQueryVo inventoryBillQueryVo) {
        return new InventoryBillPo[0];
    }

    @Override
    public void init() {

    }
}
