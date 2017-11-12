package trapx00.lightx00.client.vo.inventorystaff;

public class CommoditySortQueryVo {
    private String id;
    private String name;
    private String fatherId;

    public CommoditySortQueryVo(String id,String name,String fatherId){
        this.id=id;
        this.name=name;
        this.fatherId=fatherId;
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

    public String getFatherId() {
        return fatherId;
    }

    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }
}
