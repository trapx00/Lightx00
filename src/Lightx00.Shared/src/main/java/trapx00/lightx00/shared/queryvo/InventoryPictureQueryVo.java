package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;

public class InventoryPictureQueryVo extends BaseQueryVo<InventoryPicturePo,String>  {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public InventoryPictureQueryVo(QueryBuilderPreparation<InventoryPicturePo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public InventoryPictureQueryVo() {
        super();
    }
}
