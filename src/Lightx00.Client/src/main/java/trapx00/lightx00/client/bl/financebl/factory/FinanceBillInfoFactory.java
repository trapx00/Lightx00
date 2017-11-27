package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.financebl.FinanceBillInfo;
import trapx00.lightx00.client.bl.financebl.TradeHistoryBlController;
import trapx00.lightx00.client.bl.financebl.mock.TradeHistoryBlControllerMock;

public class FinanceBillInfoFactory {
    private static FinanceBillInfo financeBillInfo = TradeHistoryBlFactory.getController();

    /**
     * Gets a FinanceBillInfo instance
     * @return FinanceBillInfo instance
     */
    public static FinanceBillInfo getFinanceBillInfo() {
        return financeBillInfo;
    }
}
