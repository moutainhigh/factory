package com.msds.km.mapper;

import com.msds.base.mapper.BaseMapper;
import com.msds.km.entity.CardInfoEntity;

/**
 * 
 * <br>
 * <b>功能：</b>CardInfoMapper<br>
 * <b>作者：</b>lilong<br>
 * <b>日期：</b> 2015-10-14 10:57:48 <br>
 * <b>版权所有：<b>版权所有(C) 2014，wwww.minshengec.com<br>
 * <b>此类为自动生成<br>
 */
public interface CardInfoMapper extends BaseMapper<CardInfoEntity> {

	CardInfoEntity findByPhone(String phone);

}
