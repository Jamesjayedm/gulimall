package com.james.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.james.common.utils.PageUtils;
import com.james.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 17:47:42
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}
