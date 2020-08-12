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
	private String name;
	@Column
	private int age;
	@Column
	private String guardian;
	@Column
	private String gender;
	@Column
	private int travellers ;
	@Column
    private String idproof ;
	@Column
    private String proofno;
	@Column
    private String vehicle;
	@Column
    private String vehicleno;
	@Column
    private String reason ;
	@Column
    private String dates ;
	@Column
    private String fromdistrict ;
	@Column
    private String todistrict ;
	@Column
    private String  toaddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTravellers() {
		return travellers;
	}
	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public String getProofno() {
		return proofno;
	}
	public void setProofno(String proofno) {
		this.proofno = proofno;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getFromdistrict() {
		return fromdistrict;
	}
	public void setFromdistrict(String fromdistrict) {
		this.fromdistrict = fromdistrict;
	}
	public String getTodistrict() {
		return todistrict;
	}
	public void setTodistrict(String todistrict) {
		this.todistrict = todistrict;
	}
	public String getToaddress() {
		return toaddress;
	}
	public void setToaddress(String toaddress) {
		this.toaddress = toaddress;
	}
	@Override
	public String toString() {
		return "Individual [id=" + id + ", name=" + name + ", age=" + age + ", guardian=" + guardian + ", gender="
				+ gender + ", travellers=" + travellers + ", idproof=" + idproof + ", proofno=" + proofno + ", vehicle="
				+ vehicle + ", vehicleno=" + vehicleno + ", reason=" + reason + ", dates=" + dates + ", fromdistrict="
				+ fromdistrict + ", todistrict=" + todistrict + ", toaddress=" + toaddress + "]";
	}	
}
