package com.mycompany.csc229_211review_lab02hw;

//Import scanner to read input.
import java.util.Scanner;

// ToDo 5: Fix the error
// ToDo 6: Fix the constructor of Student class
// ToDo 7: Add a toString method for Student class
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {

		
		Student std1= new Student("James", (short) 20);

		//Create Scanner object.
		Scanner scanner = new Scanner(System.in);

		//Loop to make sure user types correct input.
		while (true) {
			try {
				System.out.println("Please enter GPA");
				//Scans for input then puts it through setGpa.
				double gpa = scanner.nextDouble();
				std1.setGpa(gpa);
				break;
				//Catches mismatch data types.
			} catch (Exception error) {
				System.out.println("Please enter a valid number.");
				//Clears the scanner.
				scanner.nextLine();
			}
		}
		
		System.out.println(std1);

		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		// ToDo 9: add comments and explain your code
		// ToDo 10: submit using a pull request.
	}

}