package trapx00.lightx00.client.presentationdriver.logblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.loginblservice.LoginBlService;
import trapx00.lightx00.client.blservicestub.loginblservice.LoginBlServiceStub;
import trapx00.lightx00.shared.vo.EmployeeVo;

import static org.junit.Assert.assertEquals;

public class LoginBlServiceDriver {

    LoginBlService service = new LoginBlServiceStub();
    @Test
    public void testLogin(){
        EmployeeVo expected = service.login("123","123");
        assertEquals("123",expected.getId());

    }

}
