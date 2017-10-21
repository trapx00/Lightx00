package trapx00.lightx00.shared.vo.inventorystaff;

public class CommoditySortVo{//商品分类
    String Id;
    String name;
    String[] commodityIdList;
    String preId;//父类
    String[] nextIds; //子类

    public CommoditySortVo(String Id, String name, String[] commodityIdList, String preId, String[] nextIds) {
        this.Id = Id;
        this.name = name;
        this.commodityIdList = commodityIdList;
        this.preId = preId;
        this.nextIds = nextIds;
    }
}
