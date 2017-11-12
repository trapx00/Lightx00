package trapx00.lightx00.server.data.financedata.factory;

import trapx00.lightx00.server.data.financedata.mock.InitialEstablishmentDataControllerMock;
import trapx00.lightx00.shared.dataservice.financedataservice.InitialEstablishmentDataService;

public class InitialEstablishmentDataFactory {
    private static InitialEstablishmentDataService service = new InitialEstablishmentDataControllerMock();

    public static InitialEstablishmentDataService getService() {
        return service;
    }
}
