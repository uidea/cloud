package com.cloud.controller.data.util;

import java.io.Serializable;

/**
 * @ClassName: ReturnDataMessage
 * @Description: 统一返回数据
 * @date: 2018年7月6日 下午2:43:27
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class ReturnMessage implements Serializable {

	private static final long serialVersionUID = 8868628174513497681L;
	private boolean flag;// true 正确
	private String msg;// false 错误

	public ReturnMessage() {
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
