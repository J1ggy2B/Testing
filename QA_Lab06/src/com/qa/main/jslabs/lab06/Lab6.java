package com.qa.main.jslabs.lab06;

import java.util.Scanner;

public class Lab6 {
	public void part1() {
		grades();   // Calls method grades()
	}
	public void part2() {
		account();
	}
	
	public void grades() {
		int numStudents = 5; // No of Students is 5
		String[] names = new String[numStudents];// create array of size numStudents to hold students
		int[] marks = new int[numStudents];// create array of size numStudents to hold marks
		
		for (int i = 0; i < marks.length; i++) { //iterate over ,marks array
			String nameText = String.format("Enter name for student %d: ", i); //create a user prompt for the student name assign to String nameText
			names[i] = getString(nameText); //Call getString() which uses a Scanner to capture user input & assign to names[] Array
			
			String markText = String.format("Enter a grade mark between 1..100 for student %d: ", i);// create a prompt for mark user input as String markText
			while (true)
			{
				String inputMark = getString(markText); // use getString(with our prompt) to get user input for a mark assign to inputMark
				Integer mark = tryParseInt(inputMark);  // use Integer.tryParseInt(with our prompt) to get user input for a mark assign to mark (now be int)
				// Check input is valid.
				if (mark == null) {
					System.out.println("Error: Value must be an integer. Try again.");//Error if mark null
				} else if (!(mark > 0 && mark <= 100)) {
					System.out.println("Error: marks must be between 1..100. Try again.");// Error if mark not between 0..100
				} else {
					marks[i] = mark; // Add the mark to the array if it is a valid int between 0..100
					break;
				}
			}
		}
		
		for (int i = 0; i < marks.length; i++) { //iterate through marks
			String resultText = "Grade for student %d is: %s\n"; //Building partial output String for the common text
			// Get result
			if (marks[i] >= 71) { //Check the mark
				System.out.printf(resultText, i, "Distinction"); // Populated the partial output and printed to screen Note use of printf
			}
			else if (marks[i] >= 61 && marks[i] <= 70) { // rinse and repeat for other mark ranges
				System.out.printf(resultText, i, "Merit");
			}
			else if (marks[i] >= 50 && marks[i] <= 60) {
				System.out.printf(resultText, i, "Pass");
			}
			else if (marks[i] >= 61 && marks[i] <= 70) {
				System.out.printf(resultText, i, "Merit");
			}
			else {
				System.out.printf(resultText, i, "Fail");
			}
		}
	}

	private void account() { //method account() adds interest to initialAmount each year until it hits targetAmount

		float initalAmount = 100;  // float to hold initial amount
		float targetAmount = 200;  //float to hold target
		float interestRate = 0.05f; // float to hold interest rate
		float currentAmount = initalAmount; //float currentAmount will be increased each year but is initialised to initialAmount
		int year = 1;  //int year holds the year number
		
		while (currentAmount < targetAmount) {  //Condition for loop end
			currentAmount = currentAmount + (currentAmount * interestRate); // while looping add the interest to current amount
			System.out.printf("Year %d: £%f\n", year, currentAmount); //print out the interest for each year
			year++;
		}
		
	}

	public void multiplicationTable() { //create multiplication table
		int[] col = {1,2,3,4,5,6,7,8,9,10}; //Array col holding 10 ints
		int[] row = {1,2,3,4,5,6,7,8,9,10}; //Array row holding 10 ints
		
		for (int i = 0; i < col.length; i++) { //iterate columns
			for (int j = 0; j < row.length; j++) { // for each column iterate rows
				System.out.printf("%5d", col[i] * row[j]); //print out the column times the row
			}
			System.out.println();// outputs a new line
		}
	}
	

	public Integer tryParseInt(String text) { //method parses input string to an int
		try {                                 //exception handling - try something
			return Integer.parseInt(text); //Do the parse
		} catch (NumberFormatException e) { // catch any error
			return null;
		}
	}
	
	public int getInt(String prompt) { // Prompts the user with the input String
		System.out.println(prompt); //prints String prompt to screen
		Scanner s = new Scanner(System.in); //creates a Scanner
		return s.nextInt(); //Scans in the next int and returns it as result
	}
	
	public String getString(String prompt ) { //Prompts the user for a String that is the input String we passed in
		System.out.println(prompt);				//print the prompt to screen
		Scanner s = new Scanner(System.in);		//create a new Scanner
		return s.nextLine();					//read in and return the user input as a String
	}

}