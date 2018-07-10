/**
 * Project Name:com.cloud.controller File Name:s.java Package Name:com.cloud.controller.data.web
 * Date:2018年7月9日下午3:08:06 Copyright (c) 2018, aguai_liu@163.com All Rights Reserved. version:1.0
 */
package com.cloud.controller.api;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cloud.model.core.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * ClassName: s Function: TODO Description: TODO date: 2018年7月9日 下午3:08:06
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

@RestController
@RequestMapping(value = {"/api/"})
public class ProductController {

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ApiOperation(value = "根据id获取产品信息", notes = "根据id获取产品信息", httpMethod = "GET",
      response = User.class)
  public ResponseEntity<User> get(@PathVariable Long id) {
    User user = new User();

    return ResponseEntity.ok(user);
  }

  @RequestMapping(method = RequestMethod.POST)
  @ApiOperation(value = "添加一个新的产品")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "参数错误")})
  public ResponseEntity<String> add(User product) {
    return ResponseEntity.ok("SUCCESS");
  }

  @RequestMapping(method = RequestMethod.PUT)
  @ApiOperation(value = "更新一个产品")
  @ApiResponses(value = {@ApiResponse(code = 400, message = "参数错误")})
  public ResponseEntity<String> update(User product) {
    return ResponseEntity.ok("SUCCESS");
  }

  @RequestMapping(method = RequestMethod.GET)
  @ApiOperation(value = "获取所有产品信息", notes = "获取所有产品信息", httpMethod = "GET", response = User.class,
      responseContainer = "List")
  public ResponseEntity<List<User>> getAllProducts() {
    User user = new User();
    user.setAddress("address");
    user.setAge("12");
    user.setName("lous");
    user.setIdNo("123423523");
    return ResponseEntity.ok(Arrays.asList(user, user));
  }
}
