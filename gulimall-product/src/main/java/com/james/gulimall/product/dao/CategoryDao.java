package com.james.gulimall.product.dao;

import com.james.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-24 13:59:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
