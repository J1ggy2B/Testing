package com.J1ggy;

import java.util.ArrayList;

public class Employee {
protected static ArrayList<Employee>employees = new ArrayList<>(); // Static exists before instances of class
protected static int idCount;	// note protected - avail to sub class But not accessible directly from main

private int id;
private String name;                                            
private String jobTitle;										
protected String info;

public Employee() {
	super();
}

public Employee(String name, String jobTitle ) {
    setId(++Employee.idCount * 10);
    setName(name);
    setJobTitle(jobTitle);		
}

public String getName() {  return name; }
private void setName(String name) { this.name = name; }
public String getJobTitle() { return jobTitle; }
private void setJobTitle(String jobTitle) { this.jobTitle = jobTitle;}
private void setId(int id) { this.id = id; }
public int getId() { return id;	}


protected String getInfo() { // return info for an Employee
			      info = "\n**** *****\n";
			      info += "Name: " + getName() + "\n";
			      info += "Job Title: "+ getJobTitle() + "\n";
			      info += "Employee ID: "+ getId()+ "\n";
				  return info;		
}
}