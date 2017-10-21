package trapx00.lightx00.shared.po.inventorystaff;

public class CommoditySortPo {
    //商品分类
    String id;
    String name;
    String []commodityIdList;
    String preId;//父类
    String[] nextId; //子类

    public CommoditySortPo(String id, String name, String[] commodityIdList,
                           String preId, String[] nextId) {
        this.id = id;
        this.name = name;
        this.commodityIdList = commodityIdList;
        this.preId = preId;
        this.nextId = nextId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getCommodityIdList() {
        return commodityIdList;
    }

    public String getPreId() {
        return preId;
    }

    public String[] getNextId() {
        return nextId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommodityIdList(String[] commodityIdList) {
        this.commodityIdList = commodityIdList;
    }

    public void setPreId(String preId) {
        this.preId = preId;
    }

    public void setNextId(String[] nextId) {
        this.nextId = nextId;
    }
}
