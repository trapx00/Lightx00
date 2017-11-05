package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.TradeSituationBlController;

public class TradeSituationBlServiceFactory {
    private static TradeSituationBlService instance = new TradeSituationBlController();

    public static TradeSituationBlService getInstance() {
        return instance;
    }

}
