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
    private CommodityPo []commodityList;
    @DatabaseField
    private String preId;//父类


    public CommoditySortPo(){

    }

    public CommoditySortPo(String id, String name, CommodityPo[] commodityList,
                           String preId) {
        this.id = id;
        this.name = name;
        this.commodityList = commodityList;
        this.preId = preId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CommodityPo[] getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(CommodityPo[] commodityList) {
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
