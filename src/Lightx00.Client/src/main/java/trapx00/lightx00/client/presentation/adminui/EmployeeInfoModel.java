package trapx00.lightx00.client.presentation.adminui;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.*;
import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.factory.EmployeeInfoFactory;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

import java.util.Date;

public class EmployeeInfoModel extends RecursiveTreeObject<EmployeeInfoModel> {
    private StringProperty id;
    private StringProperty name;
    private ObjectProperty<Date> workDate;
    private ObjectProperty<EmployeePosition> position;

    public EmployeeInfoModel(EmployeeVo employeeVo) {
        this.id = new SimpleStringProperty(employeeVo.getId());
        this.name = new SimpleStringProperty(employeeVo.getName());
        this.workDate = new SimpleObjectProperty<>(employeeVo.getWorkSince());
        this.position = new SimpleObjectProperty<>(employeeVo.getPosition());
    }

    public EmployeeVo toEmployeeVo() {
        EmployeeInfo employeeInfo = EmployeeInfoFactory.getEmployeeInfo();
        return employeeInfo.queryById(id.getValue());
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public EmployeePosition getPosition() {
        return position.get();
    }

    public ObjectProperty<EmployeePosition> positionProperty() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position.set(position);
    }

    public Date getWorkDate() {
        return workDate.get();
    }

    public ObjectProperty<Date> workDateProperty() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate.set(workDate);
    }

}
