package cn.blue.mall.portal.model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * 秒杀信息和商品对象封装
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct{
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}
