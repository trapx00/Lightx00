package trapx00.lightx00.client.presentation.commodityui;

import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;

import java.util.List;
import java.util.function.Consumer;

public interface CommoditySelection {
    void showCommoditySelectDialog(Consumer<List<CommodityVo>> callback);

    CommodityVo queryId(String id);
}
