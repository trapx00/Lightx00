package trapx00.lightx00.client.vo.inventorystaff;

public class CommodityQueryVo {
    private String id;
    private String name;

    public CommodityQueryVo(){
        ;
    }
    public CommodityQueryVo(String id,String name){
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
