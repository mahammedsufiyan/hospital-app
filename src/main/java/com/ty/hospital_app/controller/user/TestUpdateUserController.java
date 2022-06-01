package com.ty.hospital_app.controller.user;

import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.service.imp.UserServiceImp;

public class TestUpdateUserController {

	public static void main(String[] args) {
		
		User user=new User();
		
		user.setName("pooja");
		user.setEmail("pooja@gmail.com");
		user.setPassword("pooja@123");
		user.setRole("nurse ");
		
		UserServiceImp userService=new UserServiceImp();
		
		User user2=userService.updateUser(user,5);
		
		if(user2!=null) {
			System.out.println("user updated successfully based on id");
		}
		else {
			System.out.println("there is no user to present on that id to update");
		}
	}

}
