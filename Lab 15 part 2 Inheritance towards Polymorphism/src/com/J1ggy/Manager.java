package com.J1ggy;

//import java.util.ArrayList;

public class Manager extends Employee{
	//--Fields-----------------------------------------
	//public ArrayList<Employee>employees = new ArrayList<>(); - Moved to Employee (Parent)
	String info;
	String department;
	//--Constructor---------------------------------------
	public Manager(String name, String jobTitle, String department) {
		super(name, jobTitle);
		this.department = department;

	}
	//--Methods---------------------------------------
	public String getDepartment() {
		return this.department;
	}
@Override
public String getInfo() { // Call the parent getInfo
	String info = super.getInfo();
	info +="Department: " + getDepartment();
	return info;
}


}//END CLASS
