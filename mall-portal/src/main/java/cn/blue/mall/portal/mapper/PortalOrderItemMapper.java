package cn.blue.mall.portal.mapper;


import cn.blue.mall.portal.model.OmsOrderItem;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单商品信息自定义Dao
 * Created by macro on 2018/9/3.
 */
public interface PortalOrderItemMapper {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
