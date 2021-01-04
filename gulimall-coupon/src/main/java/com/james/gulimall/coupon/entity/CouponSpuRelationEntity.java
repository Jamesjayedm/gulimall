package com.james.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 优惠券与产品关联
 * 
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 17:09:16
 */
@Data
@TableName("sms_coupon_spu_relation")
public class CouponSpuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 优惠券id
	 */
	private Long couponId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * spu_name
	 */
	private String spuName;

}
