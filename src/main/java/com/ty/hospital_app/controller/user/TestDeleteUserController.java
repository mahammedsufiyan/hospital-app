package com.ty.hospital_app.controller.user;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.imp.UserServiceImp;

public class TestDeleteUserController {

	public static void main(String[] args) {
		UserServiceImp userService=new UserServiceImp();
		boolean res=userService.deleteUserById(2);
		if(res) {
			System.out.println("yes deleted user successfully based on id");
		}else {
			System.out.println("there is no user present in that id to delete");
		}
		
		

	}
}
