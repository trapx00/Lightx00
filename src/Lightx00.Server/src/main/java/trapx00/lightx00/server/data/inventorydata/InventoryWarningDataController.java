package trapx00.lightx00.server.data.inventorydata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryDataDaoFactory;
import trapx00.lightx00.server.data.util.CommonBillDataController;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryDetailBillPo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;


import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class InventoryWarningDataController extends UnicastRemoteObject implements InventoryWarningDataService {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public InventoryWarningDataController() throws RemoteException {

    }

    private Dao<InventoryDetailBillPo, String> inventoryDetailBillPo = InventoryDataDaoFactory.getInventoryDetailBillDao();
    private CommonBillDataController<InventoryDetailBillPo> commonBillDataController = new CommonBillDataController<>(inventoryDetailBillPo, this);

    /**
     * Submits a bill
     * @param bill
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(InventoryDetailBillPo bill) {
        return commonBillDataController.submit(bill);
    }
    /**
     *  Modifys the warning value of the commodity
     * @param id
     * @param warningValue
     * @return  whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(String id, double warningValue) {
        return null;
    }
    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return commonBillDataController.getId("in");
    }

    /**
     *  Querys a bill
     * @param query
     * @return InventoryBillVo
     */
    @Override
    public InventoryDetailBillPo[] query(InventoryBillQueryVo query) {
        List<InventoryDetailBillPo> result = commonBillDataController.query(query);
        return result.toArray(new InventoryDetailBillPo[result.size()]);
    }

    /**
     * Activates a Bill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the CashBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return commonBillDataController.activate(id);
    }

    /**
     * Abandons a Bill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return commonBillDataController.abandon(id);
    }

    /**
     * Changes the state of a bill if approval is completed.
     *
     * @param billId    the id of the bill.
     * @param billState new bill state. Only Approved and Rejected is allowed.
     * @return whether the operation is done successfully.
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState billState) throws RemoteException {
        return commonBillDataController.approvalComplete(billId, billState);
    }
}
