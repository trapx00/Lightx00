package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.vo.inventorystaff.CommodityVO;
import trapx00.lightx00.shared.vo.salestaff.ClientVO;

public class SystemSnapshotVO { //账
    //存储一次不修改
    CommodityVO[] commodities;
    ClientVO[] clients;
    BankAccountVO[] bankAccounts;
}
