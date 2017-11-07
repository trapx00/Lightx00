package trapx00.lightx00.client.vo.salestaff;


import trapx00.lightx00.shared.po.client.ClientType;

public class ClientVo {
    private String id;
    private ClientType clientType;
    private int clientLevel;
    private String name;
    private String phone;
    private String address;
    private String zipCode;
    private String email;
    private double receivableQuota;
    private double payableQuota;
    private SaleStaffVo defaultOperator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public int getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(int clientLevel) {
        this.clientLevel = clientLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getReceivableQuota() {
        return receivableQuota;
    }

    public void setReceivableQuota(double receivableQuota) {
        this.receivableQuota = receivableQuota;
    }

    public double getPayableQuota() {
        return payableQuota;
    }

    public void setPayableQuota(double payableQuota) {
        this.payableQuota = payableQuota;
    }

    public SaleStaffVo getDefaultOperator() {
        return defaultOperator;
    }

    public void setDefaultOperator(SaleStaffVo defaultOperator) {
        this.defaultOperator = defaultOperator;
    }

    public ClientVo(String id, ClientType clientType, int clientLevel, String name, String phone, String address, String zipCode, String email, double receivableQuota, double payableQuota, SaleStaffVo defaultOperator) {
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
        this.defaultOperator = defaultOperator;
    }
}
 


 

         
