package com.cloud.controller.api;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cloud.model.core.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @ClassName: UserApi
 * @Function: TODO
 * @Description: TODO
 * @date: 2018年7月10日 下午1:31:10
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

@Api(value = "user", description = "the User API")
@RequestMapping(value = { "/api/v1/" })
public interface UserApi {

	@RequestMapping(value = "/user", produces = { "application/json","application/xml" }, method = RequestMethod.GET)
	@ApiOperation(value = "获取所有用户信息", notes = "返回所有用户信息", tags = { "user" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful operation", response = List.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"), @ApiResponse(code = 404, message = "User not found") })
	ResponseEntity<List<User>> getUser();

	@RequestMapping(value = "/user/{petId}", produces = { "application/json" }, method = RequestMethod.GET)
	@ApiOperation(value = "根据ID获取用户信息", notes = "返回单个用户信息", tags = { "user" })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful operation", response = User.class),
			@ApiResponse(code = 400, message = "Invalid ID supplied"), @ApiResponse(code = 404, message = "User not found") })
	ResponseEntity<User> getUserById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") String id);

}
