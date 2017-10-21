package trapx00.lightx00.shared.po.inventorystaff;

public class CommoditySortPo{//商品分类
    String id;
    String name;
    String []commodityIdList;
    String preId;//父类
    String[] nextId; //子类

    public CommoditySortPo(String id, String name, String[] commodityIdList, String preId, String[] nextId) {
        this.id = id;
        this.name = name;
        this.commodityIdList = commodityIdList;
        this.preId = preId;
        this.nextId = nextId;
    }
}
