package com.example.CompanyAnnotation.Entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dept_locations")
public class DeptLocations {
	
	@EmbeddedId
	private DeptLocationsID id;
	
	
	
	

}