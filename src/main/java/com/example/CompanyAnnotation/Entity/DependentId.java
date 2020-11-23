package com.example.CompanyAnnotation.Entity;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Embeddable
public class DependentId implements Serializable {

	@ManyToOne
	private Employee essn;

	private String dependentName;

	public Employee getEssn() {
		return essn;
	}

	public void setEssn(Employee essn) {
		this.essn = essn;
	}

	public String getDependentName() {
		return dependentName;
	}

	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}

	public DependentId(Employee essn, String dependentName) {
		super();
		this.essn = essn;
		this.dependentName = dependentName;
	}
	
	public DependentId() {
		
	}

}

				