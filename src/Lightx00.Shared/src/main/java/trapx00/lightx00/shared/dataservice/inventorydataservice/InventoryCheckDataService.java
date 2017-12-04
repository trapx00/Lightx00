package trapx00.lightx00.shared.dataservice.inventorydataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;
import trapx00.lightx00.shared.queryvo.InventoryPictureQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryViewQueryVo;

public interface InventoryCheckDataService extends Remote {
    /**
     * Checks the invenntory change between the begintime and endtime
     * @param inventoryViewQueryVo
     * @return The inventoryView during specified time range
     */
    InventoryViewPo[] getInventoryView(InventoryViewQueryVo inventoryViewQueryVo) throws RemoteException;


}
