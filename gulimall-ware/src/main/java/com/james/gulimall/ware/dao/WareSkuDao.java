package com.james.gulimall.ware.dao;

import com.james.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 18:35:28
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
