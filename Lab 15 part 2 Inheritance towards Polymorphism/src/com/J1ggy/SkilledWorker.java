package com.J1ggy;



public class SkilledWorker extends Employee {
	//--Fields-------------------------------------

	String skill;
	
	//--Constructor--------------------------------
	public SkilledWorker() {
		super();
	}
	public SkilledWorker(String name, String jobTitle, String skill) {
		super(name, jobTitle);
		this.skill = skill;

	}
	//--Methods-----------------------------------
	public void addSkill(String skill) {
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	
	@Override
	protected String getInfo() { // return info for an Employee
	      info = "\n**** *****\n";
	      info += "Name: " + getName() + "\n";
	      info += "Job Title: "+ getJobTitle() + "\n";
	      info += "Employee ID: "+ getId()+ "\n";
	      info += "Skill: " + getSkill();
		  return info;		
}
}
