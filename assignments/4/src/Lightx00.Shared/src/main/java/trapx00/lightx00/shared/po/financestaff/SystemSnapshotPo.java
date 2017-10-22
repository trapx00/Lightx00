package trapx00.lightx00.shared.po.financestaff;

import java.util.Date;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;


public class  SystemSnapshotPo extends FinanceBillPo { //账
    //存储一次不修改
    private CommodityPo[] commodities;
    private ClientPo[] clients;
    private BankAccountPo[] bankAccounts;

    public SystemSnapshotPo(String id, Date date, BillState state, CommodityPo[] commodities,
                            ClientPo[] clients, BankAccountPo[] bankAccounts) {
        super(id, date, state, FinanceBillType.SystemSnapshot);
        this.commodities = commodities;
        this.clients = clients;
        this.bankAccounts = bankAccounts;
    }

    public CommodityPo[] getCommodities() {
        return commodities;
    }

    public void setCommodities(CommodityPo[] commodities) {
        this.commodities = commodities;
    }

    public ClientPo[] getClients() {
        return clients;
    }

    public void setClients(ClientPo[] clients) {
        this.clients = clients;
    }

    public BankAccountPo[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccountPo[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}