package com.example.CompanyAnnotation.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pNumber;

	private String pName;

	private String pLocation;

	@ManyToOne
	@JoinColumn(name = "dNumber")
	private Department dNum;

	public Long getpNumber() {
		return pNumber;
	}

	public void setpNumber(Long pNumber) {
		this.pNumber = pNumber;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpLocation() {
		return pLocation;
	}

	public void setpLocation(String pLocation) {
		this.pLocation = pLocation;
	}

	public Department getdNum() {
		return dNum;
	}

	public void setdNum(Department dNum) {
		this.dNum = dNum;
	}

	public Project(String pName, String pLocation, Department dNum) {
		super();
		this.pName = pName;
		this.pLocation = pLocation;
		this.dNum = dNum;
	}

	public Project() {

	}

}
