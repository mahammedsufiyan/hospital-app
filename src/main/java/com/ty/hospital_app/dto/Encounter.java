package com.ty.hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime admit_date_time;
	private LocalDateTime discharge_date_time;
	private String reason;
	@OneToMany(mappedBy = "encounter")
	private List<MedOrder> medOrders;
	@OneToMany(mappedBy = "encounter")
	private List<Observation> observations;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@ManyToOne
	@JoinColumn
	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getAdmit_date_time() {
		return admit_date_time;
	}

	public void setAdmit_date_time(LocalDateTime admit_date_time) {
		this.admit_date_time = admit_date_time;
	}

	public LocalDateTime getDischarge_date_time() {
		return discharge_date_time;
	}

	public void setDischarge_date_time(LocalDateTime discharge_date_time) {
		this.discharge_date_time = discharge_date_time;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<MedOrder> getMedOrders() {
		return medOrders;
	}

	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
