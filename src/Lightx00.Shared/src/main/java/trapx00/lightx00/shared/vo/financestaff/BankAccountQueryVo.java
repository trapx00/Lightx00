package trapx00.lightx00.shared.vo.financestaff;

public class BankAccountQueryVo {
    private String id;
    private String name;

    public BankAccountQueryVo(String id, String name) {
        this.id = id;
        this.name = name;
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
