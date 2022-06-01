package com.ty.hospital_app.controller.user;

import java.util.List;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.imp.UserServiceImp;

public class TestGetAllUserController {
	public static void main(String[] args) {
		UserServiceImp userService = new UserServiceImp();
		List<User> users = userService.getAllUsers();
		if (users != null) {
			int count=0;
			for (User user : users) {
				count++;
				System.out.println(count+ " -> user detail here ");
				System.out.println("user name is : "+user.getName());
				System.out.println("user email is : "+user.getEmail());
				System.out.println("user role is : "+user.getRole());
				System.out.println("user password is : "+user.getPassword());
				System.out.println("=================");
			}
		} else {
			System.out.println("there is no user to show");

		}

	}
}
