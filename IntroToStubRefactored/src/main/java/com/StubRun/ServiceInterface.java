package com.StubRun;

import java.util.List;

//THIS IS THE INTERFACE SUPPLIED BY THE CUSTOMER/OTHER TEAM - 
//ALL WE KNOW IS THAT WE MUST IMPLEMENT A METHOD "retrieveStudents() THAT RETURNS A LIST OF TYPE "Student"
//THIS COULD BE FROM A DATABASE, A CLOUD SERVICE, AN Xml FILE etc - WE DON'T KNOW HOW THE SERVICE IS IMPLEMENTED
//WE DO NEED A WAY OF RETRIEVING SAMPLE DATA FOR OUR TEST!
public interface ServiceInterface {
public List<Student>retrieveStudents();
}

