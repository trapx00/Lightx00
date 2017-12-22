package trapx00.lightx00.shared.po.salestaff;

public enum SaleStaffType {
    AStaff("A级销售主管"),
    BStaff("B级销售经理"),
    CStaff("C级销售主任"),
    DStaff("D级销售组长"),
    EStaff("E级销售业务员");

    SaleStaffType(String chinese) {
        this.chinese = chinese;
    }
    private String chinese;

    @Override
    public String toString() {
        return chinese;
    }

}
