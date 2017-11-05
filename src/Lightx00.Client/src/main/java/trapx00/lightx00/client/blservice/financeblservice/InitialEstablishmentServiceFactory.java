package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.InitialEstablishmentBlController;
import trapx00.lightx00.client.blservice.financeblservice.InitialEstablishmentBlService;

public class InitialEstablishmentServiceFactory {

    private static InitialEstablishmentBlController instance = new InitialEstablishmentBlController();

    public static InitialEstablishmentBlService getInstance() {
        return instance;
    }
}
