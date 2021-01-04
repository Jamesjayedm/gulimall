package com.james.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.common.utils.PageUtils;
import com.james.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 17:47:42
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
