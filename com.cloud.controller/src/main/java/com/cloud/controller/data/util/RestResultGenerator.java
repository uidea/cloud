package com.cloud.controller.data.util;

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

public class RestResultGenerator {

	public static <T> ResponseResult<T> genResult(boolean flag, T data, String message, String errorcode) {

		ResponseResult<T> result = new ResponseResult<T>();
		result.setFlag(flag);
		result.setData(data);
		result.setMessage(message);
		result.setErrorcode(errorcode);
		return result;
	}
}