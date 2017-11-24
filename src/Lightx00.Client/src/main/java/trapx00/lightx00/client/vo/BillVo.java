package trapx00.lightx00.client.vo;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.factory.BillDraftQueryServiceFactory;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.client.vo.draft.DraftableQueryServiceRegistry;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.draft.DraftType;

import java.util.Date;
import java.util.HashMap;

public abstract class BillVo implements Draftable {
    static {
        DraftableQueryServiceRegistry.register(DraftType.Bill, BillDraftQueryServiceFactory.getQueryService());
    }

    private BillType billType;
    private String id;
    private Date date;
    private BillState state;

    public BillVo(BillType billType, String id, Date date, BillState state) {
        this.billType = billType;
        this.id = id;
        this.date = date;
        this.state = state;
    }

    public BillType getBill() {
        return billType;
    }

    public void setBill(BillType bill) {
        this.billType = bill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BillState getState() {
        return state;
    }

    public void setState(BillState state) {
        this.state = state;
    }

    /**
     * Gets the NotificationActivateService corresponding to this type of bill. Overrides to meet the specific bill type.
     * @return NotificationActivateService
     */

    public abstract NotificationActivateService notificationActivateService();

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     * @return NotificationAbandonService
     */
    public abstract NotificationAbandonService notificationAbandonService();

    /**
     * Gets the key-value maps to display the properties. Overrides to meet the specific bill type.
     *
     * @return key-value maps for the properties
     */
    @Override
    public abstract HashMap<String, String> properties();

    /**
     * Gets DeleteService corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return DeleteService
     */
    @Override
    public abstract DraftDeleteService deleteService();

    /**
     * Gets the ContinueWritable service corresponding to this type of draft. Overrides to meet the specific bill type.
     *
     * @return ContinueWritable
     */
    @Override
    public abstract ContinueWritable continueWriteService();
}
