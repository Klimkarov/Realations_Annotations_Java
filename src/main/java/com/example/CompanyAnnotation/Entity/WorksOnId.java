package com.example.CompanyAnnotation.Entity;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class WorksOnId implements Serializable {

	@ManyToOne(cascade = CascadeType.ALL)
	private Employee essn;

	@ManyToOne(cascade = CascadeType.ALL)
	private Project pno;

	public Employee getEssn() {
		return essn;
	}

	public void setEssn(Employee essn) {
		this.essn = essn;
	}

	public Project getPno() {
		return pno;
	}

	public void setPno(Project pno) {
		this.pno = pno;
	}

	public WorksOnId(Employee essn, Project pno) {
		super();
		this.essn = essn;
		this.pno = pno;
	}

	public WorksOnId() {

	}

}
