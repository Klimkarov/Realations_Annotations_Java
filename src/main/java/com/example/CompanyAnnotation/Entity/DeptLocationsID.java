package com.example.CompanyAnnotation.Entity;


import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class DeptLocationsID implements Serializable{
	
	@ManyToOne(cascade = CascadeType.ALL)     // poradi toa sto e vo vrska so kolona od dr tabela
	private Department dNumber;               // so ova se pravi FK, inaku ke nema nisto, isto kako Dlocation
	
	private String dLocation;

	public Department getdNumber() {
		return dNumber;
	}

	public void setdNumber(Department dNumber) {
		this.dNumber = dNumber;
	}

	public String getdLocation() {
		return dLocation;
	}

	public void setdLocation(String dLocation) {
		this.dLocation = dLocation;
	}

	public DeptLocationsID(Department dNumber, String dLocation) {
		super();
		this.dNumber = dNumber;
		this.dLocation = dLocation;
	}
	
	public DeptLocationsID() {
		
	}
	
	

}

