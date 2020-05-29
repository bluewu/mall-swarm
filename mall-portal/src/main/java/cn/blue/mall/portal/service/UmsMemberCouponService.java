package cn.blue.mall.portal.service;


import cn.blue.mall.portal.model.CartPromotionItem;
import cn.blue.mall.portal.model.SmsCouponHistory;
import cn.blue.mall.portal.model.SmsCouponHistoryDetail;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户优惠券管理Service
 * Created by macro on 2018/8/29.
 */
public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    @Transactional
    void add(Long couponId);

    /**
     * 获取优惠券列表
     * @param useStatus 优惠券的使用状态
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);
}
