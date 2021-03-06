package com.msds.km.entity;

import com.msds.base.entity.BaseEntity;

/**
 * 
 * <br>
 * <b>功能：</b>CardItemDetailEntity<br>
 * <b>作者：</b>lilong<br>
 * <b>日期：</b> 2015-10-14 10:57:49 <br>
 * <b>版权所有：<b>版权所有(C) 2014，wwww.minshengec.com<br>
 * <b>此类为自动生成<br>
 */
public class CardItemDetailEntity extends BaseEntity {

	/** ID */
	private java.lang.Integer id;
	/** 会员卡号 */
	private java.lang.String cardNo;
	/** 项目名称 */
	private java.lang.String itemName;
	/** 使用次数 */
	private java.lang.Integer usedTimes;
	/** 可用次数 */
	private java.lang.Integer activeTimes;

	/**
	 * 方法: 取得java.lang.Integer
	 * 
	 * @return: java.lang.Integer ID
	 */
	public java.lang.Integer getId() {
		return this.id;
	}

	/**
	 * 方法: 设置java.lang.Integer
	 * 
	 * @param: java.lang.Integer ID
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * 方法: 取得java.lang.String
	 * 
	 * @return: java.lang.String 会员卡号
	 */
	public java.lang.String getCardNo() {
		return this.cardNo;
	}

	/**
	 * 方法: 设置java.lang.String
	 * 
	 * @param: java.lang.String 会员卡号
	 */
	public void setCardNo(java.lang.String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * 方法: 取得java.lang.String
	 * 
	 * @return: java.lang.String 项目名称
	 */
	public java.lang.String getItemName() {
		return this.itemName;
	}

	/**
	 * 方法: 设置java.lang.String
	 * 
	 * @param: java.lang.String 项目名称
	 */
	public void setItemName(java.lang.String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 方法: 取得java.lang.Integer
	 * 
	 * @return: java.lang.Integer 使用次数
	 */
	public java.lang.Integer getUsedTimes() {
		return this.usedTimes;
	}

	/**
	 * 方法: 设置java.lang.Integer
	 * 
	 * @param: java.lang.Integer 使用次数
	 */
	public void setUsedTimes(java.lang.Integer usedTimes) {
		this.usedTimes = usedTimes;
	}

	/**
	 * 方法: 取得java.lang.Integer
	 * 
	 * @return: java.lang.Integer 可用次数
	 */
	public java.lang.Integer getActiveTimes() {
		return this.activeTimes;
	}

	/**
	 * 方法: 设置java.lang.Integer
	 * 
	 * @param: java.lang.Integer 可用次数
	 */
	public void setActiveTimes(java.lang.Integer activeTimes) {
		this.activeTimes = activeTimes;
	}
}
