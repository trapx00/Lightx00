package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.employee.EmployeePo;

public class UserAccountQueryVo extends BaseQueryVo<EmployeePo,String> {
    /**
     * Instantiate a QueryVo with preparation method.
     * @param preparation QueryBuilderPreparation method
     */
    public UserAccountQueryVo(QueryBuilderPreparation<EmployeePo,String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public UserAccountQueryVo() {
        super();
    }
}
