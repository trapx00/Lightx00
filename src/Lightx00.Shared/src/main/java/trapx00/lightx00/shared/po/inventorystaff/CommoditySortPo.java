package trapx00.lightx00.shared.po.inventorystaff;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.awt.*;

@DatabaseTable(tableName = "CommoditySort")
public class CommoditySortPo {
    //商品分类
    @DatabaseField(id=true)
    private String id;
    @DatabaseField
    private String name;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private CommodityItem []commodityList;
    @DatabaseField
    private String preId;//父类
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private CommoditySortItem[] commoditySortItems;


    public CommoditySortPo(){

    }

    public CommoditySortPo(String id, String name, CommodityItem[] commodityList,
                           String preId, CommoditySortItem[] commoditySortItems) {
        this.id = id;
        this.name = name;
        this.commodityList = commodityList;
        this.preId = preId;
        this.commoditySortItems=commoditySortItems;
    }
    public CommoditySortItem[] getCommoditySortItems() {
        return commoditySortItems;
    }

    public void setCommoditySortItems(CommoditySortItem[] commoditySortItems) {
        this.commoditySortItems = commoditySortItems;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CommodityItem[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityItem[] commodityList) {
        this.commodityList = commodityList;
    }

    public String getPreId() {
        return preId;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPreId(String preId) {
        this.preId = preId;
    }

}
