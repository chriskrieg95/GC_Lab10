package co.gc;

import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		String cont = "yes";
		int counter = 0;
		

		while (cont.toLowerCase().startsWith("y")) {
			// your code should start here!
			
			System.out.println("Welcome to the Circle Tester!");
			double radius = Validator.getDouble(scnr, "Enter radius: ");
			Circle circle = new Circle(radius);
			System.out.println(circle);

			// your logic should stop here if it doesn't need to be included in the loop
			System.out.println("Do you want to continue (yes/no)");
			cont = scnr.nextLine();
			counter++;
		}

		//This is our indication that the program has ended
		System.out.println("You have entered " + counter + " circles.");
		System.out.println("Goodbye!");
		

		scnr.close();
	}
}
