package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class SystemSnapshotVo extends FinanceBillVo { //账
    //存储一次不修改
    private CommodityVo[] commodities;
    private ClientVo[] clients;
    private BankAccountVo[] bankAccounts;

    public SystemSnapshotVo(String id, Date date, BillState state, CommodityVo[] commodities, ClientVo[] clients, BankAccountVo[] bankAccounts) {
        super(FinanceBillType.SystemSnapshot, id, date, state);
        this.commodities = commodities;
        this.clients = clients;
        this.bankAccounts = bankAccounts;
    }

    public CommodityVo[] getCommodities() {
        return commodities;
    }

    public void setCommodities(CommodityVo[] commodities) {
        this.commodities = commodities;
    }

    public ClientVo[] getClients() {
        return clients;
    }

    public void setClients(ClientVo[] clients) {
        this.clients = clients;
    }

    public BankAccountVo[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccountVo[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
