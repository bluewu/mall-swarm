package cn.blue.mall.portal.service.impl;


import cn.blue.mall.portal.mapper.OmsOrderReturnApplyMapper;
import cn.blue.mall.portal.model.OmsOrderReturnApply;
import cn.blue.mall.portal.model.OmsOrderReturnApplyParam;
import cn.blue.mall.portal.service.OmsPortalOrderReturnApplyService;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单退货管理Service实现类
 * Created by macro on 2018/10/17.
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
