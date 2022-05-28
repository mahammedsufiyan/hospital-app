package com.ty.hospital_app.services;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemServices {

	Item saveItem(Item item, int medOrder_id);

	Item getItemById(int item_id);

	List<Item> getItemsByMedOrderId(int medOrder_id);

	Item updateItem(Item item, int item_id);

	boolean deleteItem(int item_id);

}