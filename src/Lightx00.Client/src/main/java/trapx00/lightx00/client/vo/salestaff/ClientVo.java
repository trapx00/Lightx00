package trapx00.lightx00.client.vo.salestaff;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.presentation.helpui.ContentDisplayUi;
import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.shared.po.client.ClientType;

import java.util.HashMap;

public class ClientVo implements Draftable {
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

    /**
     * Gets DeleteService corresponding to this type of draft.
     *
     * @return DeleteService
     */
    @Override
    public DraftDeleteService deleteService() {
        return null;
    }

    /**
     * Gets the DraftContinueWritableUiController service corresponding to this type of draft.
     *
     * @return DraftContinueWritableUiController
     */
    @Override
    public DraftContinueWritableUiController continueWritableUi() {
        return null;
    }

    /**
     * 显示详细信息UI
     *
     * @return 显示详细信息UI
     */
    @Override
    public ContentDisplayUi contentDisplayUi() {
        return null;
    }
}
 


 

         
