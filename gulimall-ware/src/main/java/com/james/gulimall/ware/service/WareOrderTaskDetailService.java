package com.james.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.common.utils.PageUtils;
import com.james.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 18:35:28
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

