package com.basic;

public class IfElseIf {

	public static void main(String[] args) {

		int marks=50;
		
				if(marks>=90) {
			System.out.println("Grade is A");
		}
		else if(marks>=89) {
			System.out.println("Grade is B");
		}
	
		else if(marks>=79) {
			System.out.println("Grade is C");
		}
				
		else {
			System.out.println("Fail");
		}
	}
}
