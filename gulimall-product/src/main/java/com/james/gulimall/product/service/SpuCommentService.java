package com.james.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.common.utils.PageUtils;
import com.james.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-24 13:59:52
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

