package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_organisation")
public class Organisation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String Name;
	@Column
	private String Email;
	@Column
	private String Designation;
	@Column
	private String org_address;
	@Column
	private String From_district;
	@Column
	private String To_district;
	@Column
	private String To_address;
	@Column
	private String proof_type;
	@Column
	private String proof_number;
	@Column
	private int Workersno;
	@Column
    private String vehicle;
	@Column
    private String vehicle_number; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getOrg_address() {
		return org_address;
	}
	public void setOrg_address(String org_address) {
		this.org_address = org_address;
	}
	public String getFrom_district() {
		return From_district;
	}
	public void setFrom_district(String from_district) {
		From_district = from_district;
	}
	public String getTo_district() {
		return To_district;
	}
	public void setTo_district(String to_district) {
		To_district = to_district;
	}
	public String getTo_address() {
		return To_address;
	}
	public void setTo_address(String to_address) {
		To_address = to_address;
	}
	public String getProof_type() {
		return proof_type;
	}
	public void setProof_type(String proof_type) {
		this.proof_type = proof_type;
	}
	public String getProof_number() {
		return proof_number;
	}
	public void setProof_number(String proof_number) {
		this.proof_number = proof_number;
	}
	public int getWorkersno() {
		return Workersno;
	}
	public void setWorkersno(int workersno) {
		Workersno = workersno;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	@Override
	public String toString() {
		return "Organisation [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Designation=" + Designation
				+ ", org_address=" + org_address + ", From_district=" + From_district + ", To_district=" + To_district
				+ ", To_address=" + To_address + ", proof_type=" + proof_type + ", proof_number=" + proof_number
				+ ", Workersno=" + Workersno + ", vehicle=" + vehicle + ", vehicle_number=" + vehicle_number + "]";
	}
	
}
