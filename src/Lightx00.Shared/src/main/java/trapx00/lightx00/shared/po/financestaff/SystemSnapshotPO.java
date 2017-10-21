package trapx00.lightx00.shared.po.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.Date;

public class  SystemSnapshotPo extends FinanceBillPo { //账
    //存储一次不修改
    CommodityPo[] commodities;
    ClientPo[] clients;
    BankAccountPo[] bankAccounts;

    public SystemSnapshotPo(String id, Date date, BillState state, CommodityPo[] commodities, ClientPo[] clients, BankAccountPo[] bankAccounts) {
        super(id, date, state, FinanceBillType.SystemSnapshot);
        this.commodities = commodities;
        this.clients = clients;
        this.bankAccounts = bankAccounts;
    }
}