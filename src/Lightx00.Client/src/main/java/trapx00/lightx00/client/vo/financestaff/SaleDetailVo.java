package trapx00.lightx00.client.vo.financestaff;

public class SaleDetailVo { //销售明细表
    private SaleRecordVo[] records;

    public SaleDetailVo(SaleRecordVo[] records) {
        this.records = records;
    }

    public SaleRecordVo[] getRecords() {
        return records;
    }
}
