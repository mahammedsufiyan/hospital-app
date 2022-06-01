package com.ty.hospital_app.controller.medorder;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.imp.MedOrderServiceImp;

public class TestGetMedOrderByEncounterIdController {
	public static void main(String[] args) {

		MedOrderServiceImp medOrderServiceImp = new MedOrderServiceImp();
		List<MedOrder> medOrders = medOrderServiceImp.getMedOrderByEncounterId(1);
		if (medOrders != null) {
			for (MedOrder medOrder : medOrders) {
				System.out.println(medOrder.getOreder_date_time());

			}
		}else {
			System.out.println("there is no med order id is present to show");

		}

	}
}
