package trapx00.lightx00.server.data.bankaccountdata;

import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class BankAccountDataController extends UnicastRemoteObject implements BankAccountDataService {

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
    protected BankAccountDataController() throws RemoteException {
    }

    /**
     * Queries bank account.
     *
     * @param query query
     * @return Bank accounts that match query
     */
    @Override
    public BankAccountPo[] query(BankAccountQueryVo query) {
        return new BankAccountPo[0];
    }

    /**
     * Adds a account.
     *
     * @param account new account
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(BankAccountPo account) {
        return null;
    }

    /**
     * Modifies an account with the id.
     *
     * @param account new account info
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(BankAccountPo account) {
        return null;
    }

    /**
     * Deletes an account.
     *
     * @param id id for the account to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(String id) {
        return null;
    }
}
