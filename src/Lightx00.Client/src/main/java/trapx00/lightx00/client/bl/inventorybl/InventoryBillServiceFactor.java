package trapx00.lightx00.client.bl.inventorybl;

public class InventoryBillServiceFactor {

    private static InventoryBillService instance =new InventoryWarningBlController();
    /**
     * Gets a CommodityService instance.
     * @return CommodityService instance
     */
    public static InventoryBillService getInstance(){
        return instance;
    }
}
