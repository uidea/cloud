   /** 
	 * Project Name:com.cloud.controller 
	 * File Name:s.java 
	 * Package Name:com.cloud.controller.data.web 
	 * Date:2018年7月9日下午3:08:06 
	 * Copyright (c) 2018, aguai_liu@163.com All Rights Reserved. 
	 * version:1.0
	 */
package com.cloud.controller.data.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.model.core.User;



/** 
  * ClassName: s
  * Function: TODO
  * Description: TODO
  * date: 2018年7月9日 下午3:08:06 
  * 
  * @author liubin
  * @email aguai_liu@163.com
  * @version  
  * @since JDK 1.8
*/


@RestController
@RequestMapping(value = { "/api/"})
public class ProductController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> get(@PathVariable Long id) {
		User user = new User();
		
		return ResponseEntity.ok(user);
	}
}