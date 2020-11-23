package com.example.CompanyAnnotation.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long dNumber;
	
	private String dName;
	
	@ManyToOne
	@JoinColumn(name = "ssn")
	private Employee mgr_ssn;
	
	private Date mgr_start_date;

	public Long getdNumber() {
		return dNumber;
	}

	public void setdNumber(Long dNumber) {
		this.dNumber = dNumber;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Employee getMgr_ssn() {
		return mgr_ssn;
	}

	public void setMgr_ssn(Employee mgr_ssn) {
		this.mgr_ssn = mgr_ssn;
	}

	public Date getMgr_start_date() {
		return mgr_start_date;
	}

	public void setMgr_start_date(Date mgr_start_date) {
		this.mgr_start_date = mgr_start_date;
	}

	public Department(String dName, Employee mgr_ssn, Date mgr_start_date) {
		super();
		this.dName = dName;
		this.mgr_ssn = mgr_ssn;
		this.mgr_start_date = mgr_start_date;
	}
	
	
	public Department() {
		
	}
	
	
	

}
