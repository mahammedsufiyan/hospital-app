package com.ty.hospital_app.service.imp;

import java.util.List;

import com.ty.hospital_app.dao.imp.MedOrederDaoImp;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.service.MedOrder_Service;

public class MedOrderServiceImp implements MedOrder_Service {
	MedOrederDaoImp medOrederDao = new MedOrederDaoImp();

	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
//		double sum=0;
//		for(Item item:medOrder.getItems()) {
//			sum=sum+(item.getCost()*item.getQuatity());
//		}
//		medOrder.setTotal_amount(sum);
		return medOrederDao.saveMedOrder(medOrder, encounter_id);
	}

	public MedOrder getMedOrderById(int medOrder_id) {

		return medOrederDao.getMedOrderById(medOrder_id);
	}

	public List<MedOrder> getMedOrderByEncounterId(int encounter_id) {

		return medOrederDao.getMedOrderByEncounterId(encounter_id);
	}

	public MedOrder updateMedOrder(MedOrder medOrder, int medOrder_id) {

		return medOrederDao.updateMedOrder(medOrder, medOrder_id);
	}

	public boolean deleteMedOrder(int medOrder_id) {

		return medOrederDao.deleteMedOrder(medOrder_id);
	}

	public List<Item> getItemsByMedOrderId(int medOrder_id) {

		return medOrederDao.getItemsByMedOrderId(medOrder_id);
	}

}
