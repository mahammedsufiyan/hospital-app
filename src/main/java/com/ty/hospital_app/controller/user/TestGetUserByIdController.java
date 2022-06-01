package com.ty.hospital_app.controller.user;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.imp.UserServiceImp;

public class TestGetUserByIdController {
	public static void main(String[] args) {
		
		UserServiceImp userService =new UserServiceImp();
		User user=userService.getUserById(3);
		if(user!=null) {
			System.out.println("============here is user datails============");
			System.out.println("user name is : "+user.getName());
			System.out.println("user email is : "+user.getEmail());
			System.out.println("user role is : "+ user.getRole());
			System.out.println("user password is : "+user.getPassword());
		}else {
			System.out.println("there is no user present in this id ");
		}
	}

}
