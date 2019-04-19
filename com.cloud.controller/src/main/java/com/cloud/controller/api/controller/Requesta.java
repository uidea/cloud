package com.cloud.controller.api.controller;

import com.cloud.model.core.User;

/** 
  * ClassName: Requesta
  * Function: TODO
  * Description: TODO
  * date: 2019年3月15日 下午1:24:56 
  * 
  * @author liubin
  * @email aguai_liu@163.com
  * @version  
  * @since JDK 1.8
*/
public class Requesta {
	private CustInfo custInfo;
	private User user;
	/**
	 * @return the custInfo
	 */
	public CustInfo getCustInfo() {
		return custInfo;
	}
	/**
	 * @param custInfo the custInfo to set
	 */
	public void setCustInfo(CustInfo custInfo) {
		this.custInfo = custInfo;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
}
