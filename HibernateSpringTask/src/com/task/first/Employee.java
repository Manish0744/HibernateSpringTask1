package com.task.first;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name="Employee101") 
public class Employee {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private long empId; 
	private long deptId;
	private String empName; 
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = Address.class)  
	@JoinColumn(name="empId")   
	private List<Address> addresses;
	
//	@ManyToOne(cascade=CascadeType.ALL)  
//	private Department department;  
	
	private Date dateOFBirth;
	private Date joiningDate;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
//	public Department getDepartment() {
//		return department;
//	}
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
	public Date getDateOFBirth() {
		return dateOFBirth;
	}
	public void setDateOFBirth(Date dateOFBirth) {
		this.dateOFBirth = dateOFBirth;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", deptId=" + deptId + ", empName=" + empName + ", addresses=" + addresses
//				+ ", department=" + department + ", dateOFBirth=" + dateOFBirth + ", joiningDate=" + joiningDate + "]";
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptId=" + deptId + ", empName=" + empName + ", addresses=" + addresses
				+ ", dateOFBirth=" + dateOFBirth + ", joiningDate=" + joiningDate + "]";
	}
	
}
