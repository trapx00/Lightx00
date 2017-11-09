package trapx00.lightx00.shared.dataservicestub.promotiondataservice;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ComSalePromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.util.Date;

public class ComSalePromotionDataServiceStub implements ComSalePromotionDataService {
    @Override
    public ResultMessage submit(ComSalePromotionPo promotion) {
        return ResultMessage.Success;
    }

    @Override
    public ComSalePromotionPo[] queryPromotion(PromotionQueryVo query) {
        return new ComSalePromotionPo[]{
                new ComSalePromotionPo(query.getId(), query.getType(),new Date(),new Date(), PromotionState.Waiting)
        };
    }

    @Override
    public ResultMessage delete(ComSalePromotionPo promotion) {
        return ResultMessage.Success;
    }

    @Override
    public String getId(){
        return null;
    }
}
