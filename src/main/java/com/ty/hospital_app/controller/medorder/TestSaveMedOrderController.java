package com.ty.hospital_app.controller.medorder;

import java.time.LocalDateTime;
import java.util.List;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.imp.MedOrderServiceImp;

public class TestSaveMedOrderController {
	public static void main(String[] args) {

		MedOrder medOrder = new MedOrder();
		medOrder.setOreder_date_time(LocalDateTime.of(2030, 3, 23, 5, 0));
		

		MedOrderServiceImp medOrderServiceImp = new MedOrderServiceImp();
		MedOrder medOrder2 = medOrderServiceImp.saveMedOrder(medOrder, 2);
		if (medOrder2 != null) {
			System.out.println("med order is saved based on encouter id");
		} else {
			System.out.println("medorder is not saved because encouter id is not present");
		}

	}

}
