package com.james.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.james.common.utils.PageUtils;
import com.james.common.utils.Query;
import com.james.gulimall.member.dao.MemberCollectSpuDao;
import com.james.gulimall.member.entity.MemberCollectSpuEntity;
import com.james.gulimall.member.service.MemberCollectSpuService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl
    extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity>
    implements MemberCollectSpuService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberCollectSpuEntity> page =
        this.page(
            new Query<MemberCollectSpuEntity>().getPage(params),
            new QueryWrapper<MemberCollectSpuEntity>());

    return new PageUtils(page);
  }
}
