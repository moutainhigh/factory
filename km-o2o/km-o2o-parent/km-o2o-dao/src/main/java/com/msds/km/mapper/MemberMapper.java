package com.msds.km.mapper;

import com.msds.base.mapper.BaseMapper;
import com.msds.km.entity.MemberEntity;

/**
 * 
 * <br>
 * <b>功能：</b>MemberMapper<br>
 * <b>作者：</b>lilong<br>
 * <b>日期：</b> 2015-04-22 14:21:56 <br>
 * <b>版权所有：<b>版权所有(C) 2014，wwww.minshengec.com<br>
 * <b>此类为自动生成<br>
 */
public interface MemberMapper extends BaseMapper<MemberEntity> {

	MemberEntity findByOpenId(String openId);

	MemberEntity findByPhone(String phone);

}
