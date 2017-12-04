package trapx00.lightx00.shared.po.inventorystaff;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;
import java.util.Date;

public class InventoryPictureItem implements Serializable {
    //名称，型号，库存数量，库存均价，批次，批号，出厂日期
    @DatabaseField
    private String name;
    @DatabaseField
    private String id;
    @DatabaseField
    private String type;
    @DatabaseField
    private double amount;
    @DatabaseField
    private double price;
    @DatabaseField
    private String batch;
    @DatabaseField
    private String batchNo;
    @DatabaseField
    private Date date;


    public InventoryPictureItem(CommodityPo commodityPo){
        this.name=commodityPo.getName();
        this.id=commodityPo.getId();
        this.type=commodityPo.getType();
        this.amount=commodityPo.getAmount();
        this.price=commodityPo.getRetailPrice();
        this.batch=commodityPo.getBatch();
        this.batchNo=commodityPo.getBatchNo();
        this.date=commodityPo.getProductionDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
