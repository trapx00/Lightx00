package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.financebl.FinanceBillInfo;
import trapx00.lightx00.client.bl.financebl.TradeHistoryBlController;
import trapx00.lightx00.client.bl.financebl.mock.TradeHistoryBlControllerMock;
import trapx00.lightx00.client.vo.draft.DraftableQueryServiceRegistry;
import trapx00.lightx00.shared.po.draft.DraftType;

public class TradeHistoryBlFactory {
    private static TradeHistoryBlController controller = new TradeHistoryBlControllerMock();
    private static FinanceBillInfo financeBillInfo = controller;

    public static TradeHistoryBlController getController() {
        return controller;
    }

    public static FinanceBillInfo getFinanceBillInfo() {
        return financeBillInfo;
    }
}
