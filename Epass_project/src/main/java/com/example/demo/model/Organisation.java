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
	private String name;
	@Column
	private String email;
	@Column
	private String designation;
	@Column
	private String orgaddress;
	@Column
	private String fromdistrict;
	@Column
	private String todistrict;
	@Column
	private String toaddress;
	@Column
	private String prooftype;
	@Column
	private String proofnumber;
	@Column
	private int workersno;
	@Column
    private String vehicle;
	@Column
    private String vehiclenumber; 
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOrgaddress() {
		return orgaddress;
	}
	public void setOrgaddress(String orgaddress) {
		this.orgaddress = orgaddress;
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
	public String getProoftype() {
		return prooftype;
	}
	public void setProoftype(String prooftype) {
		this.prooftype = prooftype;
	}
	public String getProofnumber() {
		return proofnumber;
	}
	public void setProofnumber(String proofnumber) {
		this.proofnumber = proofnumber;
	}
	public int getWorkersno() {
		return workersno;
	}
	public void setWorkersno(int workersno) {
		this.workersno = workersno;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	@Override
	public String toString() {
		return "Organisation [id=" + id + ", name=" + name + ", email=" + email + ", designation=" + designation
				+ ", orgaddress=" + orgaddress + ", fromdistrict=" + fromdistrict + ", todistrict=" + todistrict
				+ ", toaddress=" + toaddress + ", prooftype=" + prooftype + ", proofnumber=" + proofnumber
				+ ", workersno=" + workersno + ", vehicle=" + vehicle + ", vehiclenumber=" + vehiclenumber + "]";
	}
	
}
