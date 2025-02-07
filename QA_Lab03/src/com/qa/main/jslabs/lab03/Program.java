package com.qa.main.jslabs.lab03;

import java.util.Scanner;

public class Program {
    static Scanner s;
    
	public static void main(String[] args) {
		s = new Scanner(System.in);
		// Lab 3 Part 1
		int aNumber = getInt("Enter an integer: ");
		String text = getString("Enter a string: ");

		System.out.printf("The int is %d. The string is %s ", aNumber, text);

		s.close();
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
//		s = new Scanner(System.in);
			return s.nextInt();
	}
	
	public static String getString(String prompt ) {
		System.out.println(prompt);
		s = new Scanner(System.in);
			return s.nextLine();
	}

}//Notice s is never closed - How might this be improved? Hint void return type s.close()? - Fixed Version