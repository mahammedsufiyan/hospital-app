package com.ty.hospital_app.controller.item;

import java.util.List;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.service.imp.ItemServiceImp;

public class TestGetItemByMedOrderIdController {
	public static void main(String[] args) {
		
		ItemServiceImp itemServiceImp=new ItemServiceImp();
		List<Item> items=itemServiceImp.getItemByMedOrderId(3);
		if(items!=null) {
			for(Item item:items) {
				System.out.println("=================");
				System.out.println(item.getCost());
				System.out.println(item.getMedicName());
				System.out.println(item.getQuatity());
				System.out.println("=================");

			}
		}else {
			System.out.println("there is no med order id is present show detail of item");
		}
	}

}
