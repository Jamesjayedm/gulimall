package com.james.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.common.utils.PageUtils;
import com.james.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 17:47:42
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
