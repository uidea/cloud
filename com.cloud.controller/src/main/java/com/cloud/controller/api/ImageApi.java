package com.cloud.controller.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/** 
  * ClassName: ImageApi
  * Function: TODO
  * Description: TODO
  * date: 2019年1月22日 上午9:10:18 
  * 
  * @author liubin
  * @email aguai_liu@163.com
  * @version  
  * @since JDK 1.8
*/
@Api(value = "image", description = "the image API")
@RequestMapping(value = { "/image/v1/" })
public interface ImageApi {
	@RequestMapping(value = "/image", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
	@ApiOperation(value = "获取所有用户信息", notes = "返回所有用户信息", tags = { "image" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful operation", response = List.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"), @ApiResponse(code = 404, message = "User not found") })
	
	ResponseEntity<String> getUser();
}
