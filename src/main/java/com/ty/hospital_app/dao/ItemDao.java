package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemDao {

	Item saveItem(Item item, int medOrder_id);

	Item getItemById(int item_id);

	List<Item> getItemsByMedOrderId(int medOrder_id);

	Item updateItem(Item item, int item_id);

	boolean deleteItem(int item_id);

}