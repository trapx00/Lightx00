package trapx00.lightx00.client.vo.inventorystaff;

import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

public class CommoditySortVo {
    //商品分类
    private String id;
    private String name;
    private String[] commodityIdList;
    private String preId;//父类
    private String[] nextIds; //子类

    //public static CommoditySortPo commoditySortVotoPo(CommoditySortVo  commoditySortVo){
   //     return new CommoditySortPo(commoditySortVo.getId(),commoditySortVo.getName(),commoditySortVo.get)
   // }

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
