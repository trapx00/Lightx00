package trapx00.lightx00.shared.po.employee;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "EmployeeFaceIdInfo")
public class EmployeeFaceIdInfo {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String employeeId;

    @DatabaseField
    private String imgRemoteUrl;

    public EmployeeFaceIdInfo() {
    }

    public EmployeeFaceIdInfo(int id, String employeeId, String imgRemoteUrl) {
        this.id = id;
        this.employeeId = employeeId;
        this.imgRemoteUrl = imgRemoteUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getImgRemoteUrl() {
        return imgRemoteUrl;
    }

    public void setImgRemoteUrl(String imgRemoteUrl) {
        this.imgRemoteUrl = imgRemoteUrl;
    }
}
