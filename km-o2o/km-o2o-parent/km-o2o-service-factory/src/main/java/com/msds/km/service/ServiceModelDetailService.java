package com.msds.km.service;

import java.util.List;

import com.msds.base.service.BaseService;
import com.msds.km.entity.ServiceModelDetailEntity;

/**
 * 
 * <br>
 * <b>功能：</b>ServiceModelDetailService<br>
 * <b>作者：</b>lilong<br>
 * <b>日期：</b> 2015-04-29 10:57:16 <br>
 * <b>版权所有：<b>版权所有(C) 2014，wwww.minshengec.com<br>
 * <b>此类为自动生成<br>
 */
public interface ServiceModelDetailService extends BaseService<ServiceModelDetailEntity> {

	public List<ServiceModelDetailEntity> findByBrandIsShow();
}
