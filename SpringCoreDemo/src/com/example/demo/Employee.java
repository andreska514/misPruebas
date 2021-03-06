package com.example.demo;

public class Employee {
	//Attributes
	int eid;
	String ename;
	String address;
	char gender;
	
	// Methods
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String address, char gender) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.gender = gender;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
	
	
}
