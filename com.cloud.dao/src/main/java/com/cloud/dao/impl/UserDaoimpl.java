package com.cloud.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cloud.dao.dao.UserDao;
import com.cloud.model.core.User;

/**
 * @ClassName: UserServiceimpl
 * @Function: TODO
 * @Description: TODO
 * @date: 2018年7月10日 下午5:02:00
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

@Repository
public class UserDaoimpl implements UserDao {

	/**
	 * @see com.cloud.service.service.UserService#getUser()
	 */
	@Override
	public List<User> getUser() {
		User user = new User();
		user.setAddress("陕西");
		user.setAge("26");
		user.setDept(123);
		user.setEdu(1);
		user.setId("100001");
		user.setName("张三");
		List<User> list = Arrays.asList(user, user);
		return list;
	}

	/**
	 * @see com.cloud.service.service.UserService#getUserById(java.lang.String)
	 */
	@Override
	public User getUserById(String id) {
		User user = new User();
		user.setAddress("陕西");
		user.setAge("26");
		user.setDept(123);
		user.setEdu(1);
		user.setId("100001");
		user.setName("张三");
		return user;
	}

	/**
	 * @see com.cloud.service.service.UserService#addUser(com.cloud.model.core.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.cloud.service.service.UserService#deleteUserById(java.lang.String)
	 */
	@Override
	public void deleteUserById(String id) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.cloud.service.service.UserService#deleteUserBatch(java.lang.String[])
	 */
	@Override
	public void deleteUserBatch(String[] ids) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.cloud.service.service.UserService#updateUser(com.cloud.model.core.User)
	 */
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
