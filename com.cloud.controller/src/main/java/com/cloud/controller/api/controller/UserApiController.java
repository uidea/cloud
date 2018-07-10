package com.cloud.controller.api.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import com.cloud.controller.api.UserApi;
import com.cloud.model.core.User;

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

  /**
   * 获取所有用户信息
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

  /**
   * 根据ID获取用户信息
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
    List<User> list = Arrays.asList(user, user);
    return new ResponseEntity<List<User>>(list, HttpStatus.OK);
  }

}
