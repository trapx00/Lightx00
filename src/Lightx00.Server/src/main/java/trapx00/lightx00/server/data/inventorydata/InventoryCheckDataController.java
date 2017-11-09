package trapx00.lightx00.server.data.inventorydata;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class InventoryCheckDataController extends UnicastRemoteObject implements InventoryCheckDataService {
    /**
     *
     * @throws RemoteException
     */
    public InventoryCheckDataController() throws RemoteException {
        super();
    }
    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */
    @Override
    public InventoryViewPo submit(Date beginTime, Date endTime) throws RemoteException{
        return null;
    }
    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPicturePo submit(Date time)throws RemoteException {
        return null;
    }

    @Override
    public void init() throws RemoteException{

    }
}
