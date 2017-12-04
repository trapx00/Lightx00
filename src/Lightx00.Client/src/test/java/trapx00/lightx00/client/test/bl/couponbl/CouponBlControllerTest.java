package trapx00.lightx00.client.test.bl.couponbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.couponbl.CouponBlController;
import trapx00.lightx00.client.bl.couponbl.factory.CouponFactory;
import trapx00.lightx00.client.vo.manager.CouponVo;
import trapx00.lightx00.shared.po.ResultMessage;

import java.util.Date;

import static org.junit.Assert.*;

public class CouponBlControllerTest {
    private CouponBlController controller = CouponFactory.getController();
    private CouponVo coupon = new CouponVo(200,new Date());

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,controller.add(coupon));
    }

    @Test
    public void sendCoupon() throws Exception {
        assertEquals(ResultMessage.Success,controller.add(coupon));
    }

    @Test
    public void useCoupon() throws Exception {
        assertEquals(ResultMessage.Success,controller.add(coupon));
    }
}