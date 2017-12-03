package trapx00.lightx00.shared.po.inventorystaff;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;


@DatabaseTable(tableName = "InventoryPicture")
public class InventoryPicturePo {
    //名称，型号，库存数量，库存均价，批次，批号，出厂日期
    @DatabaseField(id = true)
    private String id;
    @DatabaseField
    private Date time;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    private InventoryPictureItem[] items;

    public InventoryPicturePo(String id, Date time, InventoryPictureItem[] items) {
        this.time = time;
        this.items = items;
    }
    public InventoryPicturePo() {

    }
    public Date getTime() {
        return time;
    }

    public InventoryPictureItem[] getItems() {
        return items;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setItems(InventoryPictureItem[] items) {
        this.items = items;
    }
}
