package com.ty.hospital_app.controller.item;

import com.ty.hospital_app.service.imp.ItemServiceImp;

public class TestDeleteItemController {
	public static void main(String[] args) {
		ItemServiceImp itemServiceImp=new  ItemServiceImp();
		boolean result=itemServiceImp.deleteItem(4);
		if(result) {
			System.out.println("yes deleted");
		}else {
			System.out.println("no");
		}
	}

}
