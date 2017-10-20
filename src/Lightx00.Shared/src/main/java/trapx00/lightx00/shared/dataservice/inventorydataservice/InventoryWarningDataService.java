package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPO;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPO;

public interface InventoryWarningDataService {
    public ResultMessage submit(InventoryBillPO bill);
    public ResultMessage modify(CommodityPO commodity, double ModifyWarning);//修改警戒值
    public InventoryBillPO[] getAlarmByIDs(String... IDs);//提供报警
    public InventoryBillPO[] getOverflowByIDs(String... IDs);//提供报溢
    public InventoryBillPO[] getLossByIDs(String... IDs);//提供报损
    public void init();
}
