package trapx00.lightx00.shared.po.financestaff;

import trapx00.lightx00.shared.po.client.ClientPO;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPO;

public class  SystemSnapshotPO { //账
    //存储一次不修改
    CommodityPO[] commodities;
    ClientPO[] clients;
    BankAccountPO[] bankAccounts;
}