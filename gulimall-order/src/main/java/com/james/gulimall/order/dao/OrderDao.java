package com.james.gulimall.order.dao;

import com.james.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 18:20:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
