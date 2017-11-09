package trapx00.lightx00.client.blservice.saleblservice;

import trapx00.lightx00.client.bl.salebl.SaleBillBlController;

public class SaleBillBlServiceFactory {
    SaleBillBlService saleBillBlService=new SaleBillBlController();

    public SaleBillBlService getInstance() {
        return saleBillBlService;
    }
}
