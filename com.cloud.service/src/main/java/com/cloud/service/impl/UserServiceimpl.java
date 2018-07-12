package com.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.dao.dao.UserDao;
import com.cloud.model.core.User;
import com.cloud.service.service.UserService;

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
@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * @see com.cloud.service.service.UserService#getUser()
	 */
	@Override
	public List<User> getUser() {
		return userDao.getUser();
	}

	/**
	 * @see com.cloud.service.service.UserService#getUserById(java.lang.String)
	 */
	@Override
	public User getUserById(String id) {
		return userDao.getUserById(id);
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
