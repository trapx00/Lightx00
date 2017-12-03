package trapx00.lightx00.client.bl.loginbl.mock;

import trapx00.lightx00.client.bl.loginbl.FaceIdAuthenticationBlController;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;

import java.util.Date;
import java.util.Random;

public class FaceIdAuthenticationBlControllerMock extends FaceIdAuthenticationBlController {
    /**
     * Login with image.
     *
     * @param bytes image in bytes
     * @return EmployeeVo if authenticated. null otherwise.
     */
    @Override
    public EmployeeVo authenticate(byte[] bytes) {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new FinanceStaffVo("face id test","1", new Date(), "123","0001");
        } else {
            return null;
        }

    }
}
