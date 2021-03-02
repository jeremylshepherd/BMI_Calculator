/*
 * CIS 2122
 * 01/12/2020
 * Jeremy L. Shepherd
 * BMICalculator
 * A console program that takes in user input to 
 * determine BMI and to determine goal BMI.
 * Note: the IDE suggested IOException as a fix and I implemented it based on that
 */

import java.io.IOException;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) throws IOException {
		
		//Variables		
		double height, weight, bmi, idealBMI, idealWeight;
		Scanner input = new Scanner(System.in);
		
		//Greeting
		System.out.println("Welcome to Shepherd's BMI Calculator\n");
		
		//User Prompt and input collection
		System.out.print("How much do you weigh in pounds: ");		
		weight = input.nextDouble();
		System.out.println();									//Create separation in output
		
		//User Prompt and input collection
		System.out.print("How tall are you in inches? ");
		height = input.nextDouble();
		
		//Calculate and display BMI
		bmi = (weight/ (height * height)) * 703;
		System.out.println("\nYour BMI is " + bmi);		
		
		//User Prompt and input collection
		System.out.print("\nA BMI between 20 and 24 is considered ideal. What would you like your BMI to be? ");
		idealBMI = input.nextDouble();
		
		//My Maths is rusty but this seems to work
		idealWeight = (idealBMI * (height * height)) / 703;		
		
		//Display results
		System.out.println("\nYour weight needs to be " + idealWeight + " pounds for your BMI to be " + idealBMI);
		
		//IDE suggested to prevent "leak"
		input.close();

	}

}