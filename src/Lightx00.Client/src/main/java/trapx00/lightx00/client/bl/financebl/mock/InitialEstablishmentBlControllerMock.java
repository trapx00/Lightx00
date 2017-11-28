package trapx00.lightx00.client.bl.financebl.mock;

import trapx00.lightx00.client.bl.financebl.InitialEstablishmentBlController;
import trapx00.lightx00.client.vo.financestaff.BankAccountVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.client.ClientType;
import trapx00.lightx00.shared.queryvo.SystemSnapshotQueryVo;
import trapx00.lightx00.client.vo.financestaff.SystemSnapshotVo;

import java.util.Date;

public class InitialEstablishmentBlControllerMock extends InitialEstablishmentBlController {
    /**
     * Auto fills some contents with current system state.
     *
     * @return SystemSnapshot with current system state
     */
    @Override
    public SystemSnapshotVo autofill() {
        return new SystemSnapshotVo("123",new Date(), BillState.Approved,
            new CommodityVo[] {new CommodityVo("123","123","123",10.0,new Date(),"123","123",10.0,10.0,10.0,10.0,10.0)},
            new ClientVo[] { new ClientVo("123", ClientType.Retailer,5,"123","123","123","123","123@gmail.com",10.0,10.0,null)},
            new BankAccountVo[] { new BankAccountVo(1, "123",10.0, new Date())}
        );
    }

    /**
     * Submits the system snapshot.
     *
     * @param snapshot SystemSnapVo to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(SystemSnapshotVo snapshot) {
        return ResultMessage.Success;
    }

    /**
     * Saves a half-completed system snapshot as a draft.
     *
     * @param snapshot SystemSnapshotVo to be saved as draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(SystemSnapshotVo snapshot) {
        return ResultMessage.Success;
    }

    /**
     * Deletes a draft.
     *
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return ResultMessage.Success;
    }

    /**
     * Queries SystemSnapshot.
     *
     * @param query query
     * @return SystemSnapshotVos that match the query
     */
    @Override
    public SystemSnapshotVo[] query(SystemSnapshotQueryVo query) {
        return  new SystemSnapshotVo[]{
                new SystemSnapshotVo("123", new Date(), BillState.Approved,
                        new CommodityVo[]{new CommodityVo("123", "123", "123", 10.0, new Date(), "123", "123", 10.0, 10.0, 10.0, 10.0, 10.0)},
                        new ClientVo[]{new ClientVo("123", ClientType.Retailer, 5, "123", "123", "123", "123", "123@gmail.com", 10.0, 10.0, null)},
                        new BankAccountVo[]{new BankAccountVo(1, "123", 10.0, new Date())}
                )
        };
    }

    /**
     * Abandons a bill.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        return super.abandon(id);
    }

    /**
     * Activates a bill that has been approved of.
     *
     * @param id id for the bill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        return ResultMessage.Success;
    }

    /**
     * When bill is approved, this method is called to modify the state of the bill.
     *
     * @param billId id for the bill
     * @param state  newState. Only BillState.Approved and BillState.Rejected are allowed.
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage approvalComplete(String billId, BillState state) {
        return ResultMessage.Success;
    }
}
