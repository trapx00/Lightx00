package trapx00.lightx00.client.vo.inventorystaff;

import java.util.Date;
import java.util.HashMap;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.factory.PaymentBillFactory;
import trapx00.lightx00.client.bl.inventorybl.InventoryBillServiceFactor;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryWarningFactory;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlServiceFactory;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.bill.BillType;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.po.salestaff.CommodityItem;

public  class InventoryBillVo extends InventoryBillBaseVo {
    //报损报溢报警
    String operatorId;
    CommodityVo[] commodities;//商品
    double[] amountList;//报损报警报溢数量
    InventoryBillType type;
;

    public InventoryBillVo(String id, Date date, BillState state, String operatorId,
                           CommodityVo[] commodities, double[] amountList, InventoryBillType type) {
        super(id, date, state,type);
        this.operatorId = operatorId;
        this.commodities = commodities;
        this.amountList = amountList;
        this.type = type;
    }

    public  String getOperatorId() {
        return operatorId;
    }

    public CommodityVo[] getCommodities() {
        return commodities;
    }

    public void setCommodities(CommodityVo[] commodities) {
        this.commodities = commodities;
    }

    public double[] getAmountList() {
        return amountList;
    }

    public void setAmountList(double[] amountList) {
        this.amountList = amountList;
    }

    public InventoryBillType getType() {
        return type;
    }



    /**
     * Gets the NotificationActivateService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationActivateService
     */
    @Override
    public NotificationActivateService notificationActivateService() {
        return InventoryWarningFactory.getNotificationActivateService();
    }

    /**
     * Gets the NotificationAbandonService corresponding to this type of bill. Overrides to meet the specific bill type.
     *
     * @return NotificationAbandonService
     */
    @Override
    public NotificationAbandonService notificationAbandonService() {
        return InventoryWarningFactory.getNotificationAbandonService();
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
        return InventoryWarningFactory.getDraftDeleteService();
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
