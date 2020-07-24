package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_district")
public class District {	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column(nullable=false)
	private String district_name;
	@Column
	private Integer active_counts;
	@Column
	private String count_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public Integer getActive_counts() {
		return active_counts;
	}
	public void setActive_counts(Integer active_counts) {
		this.active_counts = active_counts;
	}
	public String getCount_status() {
		return count_status;
	}
	public void setCount_status(String count_status) {
		this.count_status = count_status;
	}
	@Override
	public String toString() {
		return "District [id=" + id + ", district_name=" + district_name + ", active_counts=" + active_counts
				+ ", count_status=" + count_status + "]";
	}	
	
}
