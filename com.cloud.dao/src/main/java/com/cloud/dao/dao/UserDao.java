package com.cloud.dao.dao;

import java.util.List;

import com.cloud.model.core.User;

/**
 * @ClassName: UserServiceImpl
 * @Function: TODO
 * @Description: TODO
 * @date: 2018年7月10日 下午4:58:59
 * 
 * @author liubin
 * @email aguai_liu@163.com
 * @version
 * @since JDK 1.8
 */

public interface UserDao {
	public List<User> getUser();

	public User getUserById(String id);

	public void addUser(User user);

	public void deleteUserById(String id);

	public void deleteUserBatch(String[] ids);

	public User updateUser(User user);
}
