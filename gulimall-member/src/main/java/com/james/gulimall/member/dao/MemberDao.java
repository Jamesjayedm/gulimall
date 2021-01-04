package com.james.gulimall.member.dao;

import com.james.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pyj
 * @email 631967081@gmail.com
 * @date 2020-12-28 17:47:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
