package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_individual")
public class Individual {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String Name;
	@Column
	private int Age;
	@Column
	private String Guardian_name;
	@Column
	private String Gender;
	@Column
	private int Travellers ;
	@Column
    private String ID_proof ;
	@Column
    private String ID_proof_number;
	@Column
    private String vehicle;
	@Column
    private String vehicle_number;
	@Column
    private String Reason ;
	@Column
    private String Pass_requiring_dates ;
	@Column
    private String From_district ;
	@Column
    private String To_district ;
	@Column
    private String  To_address;
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGuardian_name() {
		return Guardian_name;
	}
	public void setGuardian_name(String guardian_name) {
		Guardian_name = guardian_name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getTravellers() {
		return Travellers;
	}
	public void setTravellers(int travellers) {
		Travellers = travellers;
	}
	public String getID_proof() {
		return ID_proof;
	}
	public void setID_proof(String iD_proof) {
		ID_proof = iD_proof;
	}
	public String getID_proof_number() {
		return ID_proof_number;
	}
	public void setID_proof_number(String iD_proof_number) {
		ID_proof_number = iD_proof_number;
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
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getPass_requiring_dates() {
		return Pass_requiring_dates;
	}
	public void setPass_requiring_dates(String pass_requiring_dates) {
		Pass_requiring_dates = pass_requiring_dates;
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
	@Override
	public String toString() {
		return "Individual [id=" + id + ", Name=" + Name + ", Age=" + Age + ", Guardian_name=" + Guardian_name
				+ ", Gender=" + Gender + ", Travellers=" + Travellers + ", ID_proof=" + ID_proof + ", ID_proof_number="
				+ ID_proof_number + ", vehicle=" + vehicle + ", vehicle_number=" + vehicle_number + ", Reason=" + Reason
				+ ", Pass_requiring_dates=" + Pass_requiring_dates + ", From_district=" + From_district
				+ ", To_district=" + To_district + ", To_address=" + To_address + "]";
	}
	
}
