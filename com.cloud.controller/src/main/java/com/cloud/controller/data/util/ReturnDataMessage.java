/**
 * 
 */
package com.cloud.controller.data.util;

/** 
  * ClassName: ReturnDataMessage
  * Function: TODO
  * Description: TODO
  * date: 2018年7月6日 下午3:53:40 
  * 
  * @author liubin
  * @email aguai_liu@163.com 
  * @version  
  * @since JDK 1.8
*/
public class ReturnDataMessage extends ReturnMessage{

	private static final long serialVersionUID = 7909500185062301574L;
	private Object object;
	
	public ReturnDataMessage() {
	}

	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(Object object) {
		this.object = object;
	}

}
