package com.james.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.common.utils.PageUtils;
import com.james.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 18:20:44
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

