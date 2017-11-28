package trapx00.lightx00.shared.queryvo;

public class InventoryGiftQueryVo  extends  BaseQueryVo<InventoryGiftQueryVo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public InventoryGiftQueryVo(QueryBuilderPreparation<InventoryGiftQueryVo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public InventoryGiftQueryVo() {
        super();
    }
}