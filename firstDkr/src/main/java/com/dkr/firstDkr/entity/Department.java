package com.dkr.firstDkr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Department")
@Entity

public class Department {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departId;
	@Column(name="depart_name")
	private String departName;
	@Column(name="depart_code")
	private String departCode;
	
	
	public Long getDepartId() {
		return departId;
	}
	public void setDepartId(Long departId) {
		this.departId = departId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getDepartCode() {
		return departCode;
	}
	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}
	
	

}
