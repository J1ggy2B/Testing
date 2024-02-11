package com.StubExample;

public class Student {  // A CLASS STUDENT WITH 3 FIELDS "ID", "name" & "Course"
	private int ID;
	private String name; 
    private String course;

public Student (String name, String course) {  // THE CONDTRUCTOR TAKES A VALUE FOR "name" & "course"
	this.name = name;
	this.course=course;
	}
	// Getter and Setter methods
	public int getID() { // Get the ID
		return ID;
	}
	public void setID(int iD) {  //Set the ID
		ID = iD;
	}
	public String getName() {  //Get the name
		return name;
	}
	public void setName(String name) { //Set the name
		this.name = name;
	}
	public String getCourse() {  //Get the course
		return course;
	}
	public void setCourse(String course) { //Set the course
		this.course = course;
	}
	// Get the instance of a Student object by it's "ID" and print the "name" & "course" else print apology
	public void getStudentDetails(int ID) {
		if(this.getID()==ID) {
		System.out.println(name + course); 
		}
		else {
			System.out.println("Apologies no student found");
		}
	}
}
