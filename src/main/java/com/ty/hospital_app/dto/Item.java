package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String med_Name;
	private double cost;
	private int qty;
	@ManyToOne
	private MedOrder medOrder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMed_Name() {
		return med_Name;
	}
	public void setMed_Name(String med_Name) {
		this.med_Name = med_Name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public MedOrder getMedOrder() {
		return medOrder;
	}
	public void setMedOrder(MedOrder medOrder) {
		this.medOrder = medOrder;
	}
	
	
}
