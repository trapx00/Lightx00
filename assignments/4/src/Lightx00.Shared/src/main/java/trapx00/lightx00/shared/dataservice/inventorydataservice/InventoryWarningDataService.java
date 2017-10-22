package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;

public interface InventoryWarningDataService {
    ResultMessage submit(InventoryBillPo bill);

    ResultMessage modify(CommodityPo commodity, double warningValue);//修改警戒值

    InventoryBillPo[] getAlarmByIds(String... ids);//提供报警

    InventoryBillPo[] getOverflowByIds(String... ids);//提供报溢

    InventoryBillPo[] getLossByIds(String... ids);//提供报损

    void init();
}
