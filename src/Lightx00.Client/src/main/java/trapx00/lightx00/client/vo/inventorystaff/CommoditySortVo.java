package trapx00.lightx00.client.vo.inventorystaff;

public class CommoditySortVo {
    //商品分类
    String id;
    String name;
    String[] commodityIdList;
    String preId;//父类
    String[] nextIds; //子类

    public CommoditySortVo(String id, String name, String[] commodityIdList,
                           String preId, String[] nextIds) {
        this.id = id;
        this.name = name;
        this.commodityIdList = commodityIdList;
        this.preId = preId;
        this.nextIds = nextIds;
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

    public String[] getNextIds() {
        return nextIds;
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

    public void setNextIds(String[] nextIds) {
        this.nextIds = nextIds;
    }
}
