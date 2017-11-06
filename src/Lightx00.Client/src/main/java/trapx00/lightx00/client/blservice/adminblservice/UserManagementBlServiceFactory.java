package trapx00.lightx00.client.blservice.adminblservice;

import trapx00.lightx00.client.bl.adminbl.AdminBlController;

public class UserManagementBlServiceFactory {
    public static UserManagementBlService getInstance(){
        return new AdminBlController();
    }
}
