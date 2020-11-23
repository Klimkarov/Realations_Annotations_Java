package com.example.CompanyAnnotation.Entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ssn;

	private String fName;

	private String lName;

	private String minit;

	private Date bdate;

	private String address;

	private String sex;

	private Integer salary;

/* slucaj koga vo ista tabela edna so druga kolona se povrzani - FK e Super_ssn kon Ssn
	   nema potreba da se vmetnuva i Ssn za da se povrze so Super_Ssn, zatoa sto so ovoj kod
	   Java avtomatski Super_ssn go povrzuva so id na tabelata , vo ovoj slucaj so Ssn */

//	@ManyToOne(cascade={CascadeType.ALL})
//	@JoinColumn(name="Super_ssn_FK")
//	private Employee Super_ssn;
//
//	@OneToMany(mappedBy="Super_ssn") // FK formiranje so sopstvenata tabela
//	private Set<Employee> subordinates = new HashSet<Employee>();
//                                  
	
	/* slucaj koga kolona od edna tabela se povrzuva so kolona od druga tabela, Dno ke bide FK
	   opsto  - FK ke bide vo edna tabela sekogas vo onaa tabela koja pretstavuva Many
	   ako ima OneToOne togas FK ima i vo dvete tabeli */

	@ManyToOne
	@JoinColumn(name = "ssn", updatable=false, insertable=false)
	private Employee superSSN;

	@ManyToOne
	@JoinColumn(name="dNumber")
	private Department dno;

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getMinit() {
		return minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee getSuperSSN() {
		return superSSN;
	}

	public void setSuperSSN(Employee superSSN) {
		this.superSSN = superSSN;
	}

	public Department getDno() {
		return dno;
	}

	public void setDno(Department dno) {
		this.dno = dno;
	}

	public Employee(String fName, String lName, String minit, Date bdate, String address, String sex, Integer salary,
			Employee superSSN, Department dno) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.minit = minit;
		this.bdate = bdate;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
		this.superSSN = superSSN;
		this.dno = dno;
	}
	
	public Employee() {
		
	}

	public Employee(String fName, String lName, String minit, Date bdate, String address, String sex, Integer salary) {
		this.fName = fName;
		this.lName = lName;
		this.minit = minit;
		this.bdate = bdate;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
	}

}

