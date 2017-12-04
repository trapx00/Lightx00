package trapx00.lightx00.shared.po.inventorystaff;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

public class CommoditySortItem implements Serializable {
    @DatabaseField
    String id;
    @DatabaseField
    String name;

    public CommoditySortItem(String id,String name){
        this.id=id;
        this.name=name;
    }
}
