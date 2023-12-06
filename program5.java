package salerecordpack;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		// Check if the CSV file path is provided as an argument
		if (args.length == 0) {
			System.out.println("Usage: java program5 <csv_file_path>");
			return;
		}

		String csvFilePath = args[0];

		// Initialize necessary objects and variables
		myBST[] carMakeBSTs = new myBST[/* number of car makes */];

		// Read CSV file and build BSTs
		long startTime = System.currentTimeMillis();
		// Implementation to read the CSV file and build BSTs
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) / 1000 + " seconds to build the binary search trees");

		// User interaction menu
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the car make (e.g., Nissan): ");
		String carMake = scanner.nextLine();
		System.out.print("Enter the date (e.g., 2022-08-01): ");
		String inputDate = scanner.nextLine();

		// Calculate the number of cars sold on and after the given date
		startTime = System.currentTimeMillis();
		// Implementation to calculate and print the result
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) / 1000 + " seconds to calculate using children count fields");

		// Calculate using recursive method
		startTime = System.currentTimeMillis();
		// Implementation to calculate and print the result using a recursive method
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) / 1000 + " seconds to calculate using recursive method");

		scanner.close();
	}
}
