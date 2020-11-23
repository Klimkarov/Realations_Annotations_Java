package com.example.CompanyAnnotation.Entity;

import javax.persistence.AssociationOverride;

import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="worksOn")
@AssociationOverrides({ 
@AssociationOverride(name = "id.essn", joinColumns = @JoinColumn(name = "ssn")),
@AssociationOverride(name = "id.pno", joinColumns = @JoinColumn(name = "pnumber")) })
public class WorksOn {
	
	@EmbeddedId
	private WorksOnId id;
	
	private Double hours;

	public WorksOnId getId() {
		return id;
	}

	public void setId(WorksOnId id) {
		this.id = id;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public WorksOn(WorksOnId id, Double hours) {
		super();
		this.id = id;
		this.hours = hours;
	}
	
	public WorksOn() {
		
	}
}
