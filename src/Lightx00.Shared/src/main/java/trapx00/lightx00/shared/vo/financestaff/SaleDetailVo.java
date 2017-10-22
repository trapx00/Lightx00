package trapx00.lightx00.shared.vo.financestaff;

public class SaleDetailVo { //销售明细表
    private SaleRecordVo[] records;

    public SaleDetailVo(SaleRecordVo[] records) {
        this.records = records;
    }

    public SaleRecordVo[] getRecords() {
        return records;
    }

    public void setRecords(SaleRecordVo[] records) {
        this.records = records;
    }
}
