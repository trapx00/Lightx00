package trapx00.lightx00.shared.po.inventorystaff;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;


@DatabaseTable(tableName = "InventoryViewBill")
public class InventoryViewPo {

    @DatabaseField(id = true)
    private String id;
    @DatabaseField
    private  Date time;
    @DatabaseField
    private InventoryViewItem[] items;

    public InventoryViewPo(String id,Date time,InventoryViewItem[] items) {
        this.id=id;
        this.time=time;
        this.items=items;
    }

    public InventoryViewItem[] getItems() {
        return items;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItems(InventoryViewItem[] items) {
        this.items = items;
    }

    public Date getTime() {
        return time;
    }


}
