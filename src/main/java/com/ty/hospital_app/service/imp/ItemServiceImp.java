package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.Item_Service;

public class ItemServiceImp implements Item_Service {
	ItemDaoImp itemDao = new ItemDaoImp();

	public Item saveItem(Item item, int medOrder_id) {
//		MedOrder medOrder=new MedOrder();
//		double sum=0;
//		for(Item items:medOrder.getItems()) {
//			sum=sum+(items.getCost()*items.getQuatity());
//		}
//		medOrder.setTotal_amount(sum);

		return itemDao.saveItem(item, medOrder_id);
	}

	public Item getItemById(int item_id) {

		return itemDao.getItemById(item_id);
	}

	public List<Item> getItemByMedOrderId(int medOrder_id) {

		return itemDao.getItemByMedOrderId(medOrder_id);
	}

	public Item updateItem(Item item, int item_id) {

		return updateItem(item, item_id);
	}

	public boolean deleteItem(int item_id) {

		return itemDao.deleteItem(item_id);
	}

}
