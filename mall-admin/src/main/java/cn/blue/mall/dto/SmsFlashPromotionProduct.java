package cn.blue.mall.dto;

import cn.blue.mall.model.PmsProduct;
import cn.blue.mall.model.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 * Created by macro on 2018/11/16.
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation{
    @Getter
    @Setter
    private PmsProduct product;
}
