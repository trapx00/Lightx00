package trapx00.lightx00.shared.vo.financestaff;

import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.shared.vo.BillVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

import java.util.Date;

public class SystemSnapshotVo extends FinanceBillVo { //账
    //存储一次不修改
    CommodityVo[] commodities;
    ClientVo[] clients;
    BankAccountVo[] bankAccounts;

    public SystemSnapshotVo(String id, Date date, BillState state, CommodityVo[] commodities, ClientVo[] clients, BankAccountVo[] bankAccounts) {
        super(FinanceBillType.SystemSnapshot, id, date, state);
        this.commodities = commodities;
        this.clients = clients;
        this.bankAccounts = bankAccounts;
    }
}
