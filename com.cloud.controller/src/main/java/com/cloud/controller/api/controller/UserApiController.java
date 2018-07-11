package com.cloud.controller.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.cloud.controller.api.UserApi;
import com.cloud.model.core.User;
import com.cloud.service.service.UserService;

/**
 * @ClassName: UserController
 * @Function: TODO
 * @Description: TODO
 * @date:2018年7月10日 下午1:40:43
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

@Controller
public class UserApiController implements UserApi {
	
	@Autowired
	private UserService userService;

	/**
	 * 获取所有用户信息
	 */
	@Override
	public ResponseEntity<List<User>> getUser() {
		List<User> list = userService.getUser();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}

	/**
	 * 根据ID获取用户信息
	 */
	@Override
	public ResponseEntity<User> getUserById(String id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
