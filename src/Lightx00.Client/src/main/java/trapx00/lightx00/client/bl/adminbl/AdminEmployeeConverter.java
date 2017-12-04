package trapx00.lightx00.client.bl.adminbl;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.bl.adminbl.EmployeeConverter;
import trapx00.lightx00.client.vo.admin.AdminVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryStaffVo;
import trapx00.lightx00.client.vo.manager.ManagerVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.po.admin.AdminPo;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryStaffPo;
import trapx00.lightx00.shared.po.manager.ManagerPo;
import trapx00.lightx00.shared.po.salestaff.SaleStaffPo;

public class AdminEmployeeConverter implements EmployeeConverter<EmployeeVo> {
    @Override
    public EmployeeVo fromPoToVo(EmployeePo po) {
        switch(po.getPosition()) {
            case Admin:
                return new AdminVo(po.getName(),po.getId(),po.getWorkSince(),po.getUsername(),po.getPassword());
            case Manager:
                return new ManagerVo(po.getName(),po.getId(),po.getWorkSince(),po.getUsername(),po.getPassword());
            case InventoryStaff:
                return new InventoryStaffVo(po.getName(),po.getId(),po.getWorkSince(),po.getUsername(),po.getPassword());
            case FinanceStaff:
                return new FinanceStaffVo(po.getName(),po.getId(),po.getWorkSince(),po.getUsername(),po.getPassword());
            case SaleStaff:
                return new SaleStaffVo(po.getName(),po.getId(),po.getWorkSince(),po.getUsername(),po.getPassword(),((SaleStaffPo)po).getSaleStaffType());
        }
        return null;
    }

    @Override
    public EmployeePo fromVoToPo(EmployeeVo vo) {
        switch(vo.getPosition()) {
            case Admin:
                return new AdminPo(vo.getName(),vo.getId(),vo.getWorkSince(),vo.getUsername(),vo.getPassword());
            case Manager:
                return new ManagerPo(vo.getName(),vo.getId(),vo.getWorkSince(),vo.getUsername(),vo.getPassword());
            case InventoryStaff:
                return new InventoryStaffPo(vo.getName(),vo.getId(),vo.getWorkSince(),vo.getUsername(),vo.getPassword());
            case FinanceStaff:
                return new FinanceStaffPo(vo.getName(),vo.getId(),vo.getWorkSince(),vo.getUsername(),vo.getPassword());
            case SaleStaff:
                return new SaleStaffPo(vo.getName(),vo.getId(),vo.getWorkSince(),vo.getUsername(),vo.getPassword(),((SaleStaffVo)vo).getSaleStaffType());
        }
        return null;
    }

}
