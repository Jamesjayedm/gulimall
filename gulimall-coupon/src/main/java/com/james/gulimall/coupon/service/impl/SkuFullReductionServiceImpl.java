package com.james.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.james.common.utils.PageUtils;
import com.james.common.utils.Query;
import com.james.gulimall.coupon.dao.SkuFullReductionDao;
import com.james.gulimall.coupon.entity.SkuFullReductionEntity;
import com.james.gulimall.coupon.service.SkuFullReductionService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl extends ServiceImpl<SkuFullReductionDao, SkuFullReductionEntity> implements SkuFullReductionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuFullReductionEntity> page = this.page(
                new Query<SkuFullReductionEntity>().getPage(params),
                new QueryWrapper<SkuFullReductionEntity>()
        );

        return new PageUtils(page);
    }

}