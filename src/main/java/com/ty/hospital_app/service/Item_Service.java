package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface Item_Service {
	Item saveItem(Item item, int medOrder_id);

	Item getItemById(int item_id);

	List<Item> getItemByMedOrderId(int medOrder_id);

	Item updateItem(Item item, int item_id);

	boolean deleteItem(int item_id);

}
