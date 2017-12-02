package trapx00.lightx00.client.bl.util;

import trapx00.lightx00.client.vo.BillVo;
import trapx00.lightx00.shared.po.bill.BillPo;

public interface BillPoVoConverter<PoType extends BillPo, VoType extends BillVo> extends PoVoConverter<PoType, VoType> {

}
