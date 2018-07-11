package com.cloud.controller.data.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.cloud.model.core.User;

/**
 * ClassName: UserController Function: TODO Description: TODO date: 2018年7月10日
 * 下午1:40:43
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

@Controller
public class UserApiController implements UserApi {

	/* (non-Javadoc)
	 * @see com.cloud.controller.api.UserApi#getUser()
	 */
	@Override
	public ResponseEntity<User> getUser() {
		User user = new User();
		user.setAddress("陕西");
		user.setAge("26");
		user.setDept(123);
		user.setEdu(1);
		user.setId("100001");
		user.setName("张三");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	/* (non-Javadoc)
	 * @see com.cloud.controller.api.UserApi#getUserById(java.lang.Long)
	 */
	@Override
	public ResponseEntity<List<User>> getUserById(Long petId) {
		User user = new User();
		user.setAddress("陕西");
		user.setAge("26");
		user.setDept(123);
		user.setEdu(1);
		user.setId("100001");
		user.setName("张三");
		List<User> list = Arrays.asList(user,user);
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	}



}
