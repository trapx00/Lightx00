package trapx00.lightx00.shared.dataservicestub.promotiondataservice;

import trapx00.lightx00.shared.dataservice.promotiondataservice.ClientPromotionDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.client.vo.manager.promotion.CommodityQueryVo;
import trapx00.lightx00.client.vo.manager.promotion.PromotionQueryVo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.util.Date;

public class ClientPromotionDataServiceStub implements ClientPromotionDataService {
    @Override
    public ResultMessage submit(ClientPromotionPo promotion) {
        return ResultMessage.Success;
    }

    @Override
    public ClientPromotionPo[] queryPromotion(PromotionQueryVo query) {
        return new ClientPromotionPo[]{
                new ClientPromotionPo(query.getId(), query.getType(),new Date(),new Date(), PromotionState.Waiting)
        };
    }

    @Override
    public ResultMessage delete(ClientPromotionPo promotion) {
        return ResultMessage.Success;
    }

    @Override
    public String getId(){
        return null;
    }
}
