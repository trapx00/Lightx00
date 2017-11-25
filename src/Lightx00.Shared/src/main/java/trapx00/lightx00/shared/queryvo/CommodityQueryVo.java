package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;

import java.util.function.Predicate;

 public class CommodityQueryVo extends BaseQueryVo<CommodityPo,String> {
     /**
      * Instantiate a QueryVo with prepration method.
      *
      * @param preparation QueryBuilderPreparation method
      */
     public CommodityQueryVo(QueryBuilderPreparation<CommodityPo, String> preparation) {
         super(preparation);
     }

     /**
      * Instantiate a QueryVo with a method which returns all rows.
      */
     public CommodityQueryVo() {
         super();
     }

 }

