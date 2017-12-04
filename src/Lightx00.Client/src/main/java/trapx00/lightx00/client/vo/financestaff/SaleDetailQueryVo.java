package trapx00.lightx00.client.vo.financestaff;

import java.util.Date;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.salestaff.ClientVo;


public class SaleDetailQueryVo { //销售明细表查询条件
    private Date start;
    private Date end;
    private String[] commodityNames;
    private ClientVo[] clients;
    private EmployeeVo[] operators;
    private int repository;

    public SaleDetailQueryVo(Date start, Date end, String[] commodityNames, ClientVo[] clients,
                             EmployeeVo[] operators, int repository) {
        this.start = start;
        this.end = end;
        this.commodityNames = commodityNames;
        this.clients = clients;
        this.operators = operators;
        this.repository = repository;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String[] getCommodityNames() {
        return commodityNames;
    }

    public void setCommodityNames(String[] commodityNames) {
        this.commodityNames = commodityNames;
    }

    public ClientVo[] getClients() {
        return clients;
    }

    public void setClient(ClientVo[] clients) {
        this.clients = clients;
    }

    public EmployeeVo[] getOperators() {
        return operators;
    }

    public void setOperator(EmployeeVo[] operator) {
        this.operators = operator;
    }

    public int getRepository() {
        return repository;
    }

    public void setRepository(int repository) {
        this.repository = repository;
    }
}
