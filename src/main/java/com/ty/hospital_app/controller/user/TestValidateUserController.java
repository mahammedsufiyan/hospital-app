package com.ty.hospital_app.controller.user;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.imp.UserServiceImp;

public class TestValidateUserController {
	public static void main(String[] args) {
		UserServiceImp userService=new UserServiceImp();
		User user=userService.validateUser("deeksha@gmail.com", "dee5ksha@123");
		if(user!=null) {
			System.out.println("=============here is user detail===========");
			System.out.println("name of user is: "+user.getName());
			System.out.println("email of user is: "+user.getEmail());
			System.out.println("role of user is: "+ user.getRole());
			System.out.println("id of user is: "+user.getId());
			
		}else {
			System.out.println("user email are password is wrong");
		}
		
	}

}
