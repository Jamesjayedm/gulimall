package com.james.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.common.utils.PageUtils;
import com.james.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 18:20:44
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

