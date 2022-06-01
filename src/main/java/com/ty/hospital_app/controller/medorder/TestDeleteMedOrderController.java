package com.ty.hospital_app.controller.medorder;

import com.ty.hospital_app.service.imp.MedOrderServiceImp;

public class TestDeleteMedOrderController {
	public static void main(String[] args) {
		MedOrderServiceImp medOrderServiceImp=new MedOrderServiceImp();
		boolean result=medOrderServiceImp.deleteMedOrder(1);
		if(result) {
			System.out.println("mid order id deleted");
		}else {
			System.out.println("mid order id  not deleted");
		}
	}

}
