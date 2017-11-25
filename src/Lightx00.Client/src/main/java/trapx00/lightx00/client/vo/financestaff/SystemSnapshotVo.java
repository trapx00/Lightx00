package trapx00.lightx00.client.vo.financestaff;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.factory.InitialEstablishmentBlFactory;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.FinanceBillType;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;

import java.util.Date;
import java.util.HashMap;

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

    /**
     * Gets the NotificationActivateService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationActivateService
     */
    @Override
    public NotificationActivateService notificationActivateService() {
        return null;
    }

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationAbandonService
     */
    @Override
    public NotificationAbandonService notificationAbandonService() {
        return null;
    }

    /**
     * Gets the BillApprovalCompleteService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return BillApprovalCompleteService
     */
    @Override
    public BillApprovalCompleteService billApprovalCompleteService() {
        return null;
    }

    /**
     * Gets the key-value maps to display the properties. Overrides to meet the specific bill type.
     *
     * @return key-value maps for the properties
     */
    @Override
    public HashMap<String, String> properties() {
        return null;
    }

    /**
     * Gets DeleteService corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return DeleteService
     */
    @Override
    public DraftDeleteService deleteService() {
        return InitialEstablishmentBlFactory.getDraftDeleteService();
    }

    /**
     * Gets the ContinueWritable service corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return ContinueWritable
     */
    @Override
    public ContinueWritable continueWriteService() {
        return null;
    }
}
