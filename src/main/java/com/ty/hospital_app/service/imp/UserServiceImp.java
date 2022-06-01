package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.UserDaoImp;
import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.User_Service;

public class UserServiceImp implements User_Service {
	UserDaoImp userDao = new UserDaoImp();

	public User saveUser(User user) {

		return userDao.saveUser(user);
	}

	public User validateUser(String email, String password) {

		return userDao.validateUser(email, password);
	}

	public List<User> getAllUsers() {

		return userDao.getAllUsers();
	}

	public User getUserById(int id) {

		return userDao.getUserById(id);
	}

	public User updateUser(User user, int id) {

		return userDao.updateUser(user, id);
	}

	public boolean deleteUserById(int id) {

		return userDao.deleteUserById(id);
	}

}
