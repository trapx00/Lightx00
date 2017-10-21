package trapx00.lightx00.shared.po.client;

public class ClientPo {
    String id;
    ClientType clientType;
    int clientLevel;
    String name;
    String phone;
    String address;
    String zipCode;
    String email;
    double receivableQuota;
    double payableQuota;
    String defaultOperatorId;

    public ClientPo(String id, ClientType clientType, int clientLevel, String name, String phone, String address, String zipCode, String email, double receivableQuota, double payableQuota, String defaultOperatorId) {
        this.id = id;
        this.clientType = clientType;
        this.clientLevel = clientLevel;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.email = email;
        this.receivableQuota = receivableQuota;
        this.payableQuota = payableQuota;
        this.defaultOperatorId = defaultOperatorId;
    }
}

