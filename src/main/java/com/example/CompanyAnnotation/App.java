package com.example.CompanyAnnotation;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MappedSuperclass;
import org.hibernate.AssertionFailure;
import org.hibernate.annotations.common.reflection.XAnnotatedElement;
import org.hibernate.annotations.common.reflection.XClass;
import org.hibernate.annotations.common.reflection.XProperty;
import org.hibernate.internal.util.StringHelper;

import com.example.CompanyAnnotation.Entity.Employee;
import com.example.CompanyAnnotation.Entity.Department;
import com.example.CompanyAnnotation.Entity.DeptLocations;
import com.example.CompanyAnnotation.Entity.DeptLocationsID;
import com.example.CompanyAnnotation.Entity.Project;
import com.example.CompanyAnnotation.Entity.WorksOn;
import com.example.CompanyAnnotation.Entity.WorksOnId;
import com.example.CompanyAnnotation.Entity.Dependent;
import com.example.CompanyAnnotation.Entity.DependentId;

public class App 
{
	
	static SessionFactory factory;
    public static void main( String[] args )
    {
    	Transaction tx = null;
		try {
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.Department.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.DependentId.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.Employee.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.Project.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.WorksOn.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.WorksOnId.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.DeptLocationsID.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.DeptLocations.class);
			cfg.addAnnotatedClass(com.example.CompanyAnnotation.Entity.Dependent.class);
			cfg.configure();
			factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();
			
			
			//Creata employee and department
    	
//			Date date = new Date(System.currentTimeMillis());
//			
//			
//			Employee emp = new Employee("Dimitar", "Josifov", "V", date , "Skopje", "M", 1234567);
//			
//			Department dep = new Department("Dept1", emp, date);
//			
//			emp.setDno(dep);
//			emp.setSuperSSN(emp);
//			
//			session.persist(emp);
//			session.persist(dep);
//			
			tx.commit();
			session.close();
    	
		}catch (Exception e) {
			System.out.println(e);
		}
    }
}
