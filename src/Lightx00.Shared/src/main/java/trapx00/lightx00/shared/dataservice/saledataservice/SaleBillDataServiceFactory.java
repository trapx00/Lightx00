package trapx00.lightx00.shared.dataservice.saledataservice;

import trapx00.lightx00.shared.data.saledata.SaleBillDataController;

public class SaleBillDataServiceFactory {

    SaleBillDataService saleBillDataService=new SaleBillDataController();

    public SaleBillDataService getInstance() {
        return saleBillDataService;
    }
}
