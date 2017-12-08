package trapx00.lightx00.client.presentation.commodityui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.*;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;

import java.util.Date;

public class CommodityItemModel extends RecursiveTreeObject<CommodityItemModel> {

    private StringProperty id;
    private StringProperty name;
    private ObjectProperty<Date> productionDate;
    private StringProperty sort;
    private ObjectProperty<Double> amount;


    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public Date getProductionDate() {
        return productionDate.get();
    }

    public ObjectProperty<Date> productionDateProperty() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate.set(productionDate);
    }

    public String getSort() {
        return sort.get();
    }

    public StringProperty sortProperty() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort.set(sort);
    }

    public Double getAmount() {
        return amount.get();
    }

    public ObjectProperty<Double> amountProperty() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount.set(amount);
    }





    public CommodityItemModel(CommodityVo vo) {
        this.id = new SimpleStringProperty(vo.getId());
        this.name = new SimpleStringProperty(vo.getName());
        this.productionDate=new SimpleObjectProperty<>(vo.getProductionDate());
        this.sort=new SimpleStringProperty(vo.getType());
        this.amount=new SimpleObjectProperty<>(vo.getAmount());
    }

    public CommodityItemModel(String id,String name,Date productionDate,String sort,double amount) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.productionDate=new SimpleObjectProperty<>(productionDate);
       this.sort=new SimpleStringProperty(sort);
        this.amount=new SimpleObjectProperty<>(amount);
    }
}
