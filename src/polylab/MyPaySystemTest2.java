package polylab;

//Programmer hierarchy test program.

/**
 *Implement the condition that for the
current month
in which the birthday of any programmer occurs. Add
a bonus of $500.00 to the payroll amount of that
programmer.
 */
import java.util.Scanner;

/**
 * File Name: MyPaySystemTest2.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 06<br>
 * Date: Mar 15th, 2022<br>
 * <p>
 */

/**
 * MyPaySystemTest.java (provides the main method to test your classes).<br>
 * This program uses Scanner to obtain user input.<br>
 */

public class MyPaySystemTest2 {

	/**
	 * 
	 * @param args command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		// create subclass objects
		SalariedProgrammer salariedProgrammer = new SalariedProgrammer("Emmanuel", "Okoro", "123-11-4567", 6, 1992,
				500.00);
		HourlyProgrammer hourlyProgrammer = new HourlyProgrammer("Mary", "Cheng", "890-22-1234", 12, 1981, 16.75, 40);
		CommissionProgrammer commissionProgrammer = new CommissionProgrammer("Martha", "Peter", "567-33-8901", 9, 1983,
				23000, .06);
		BasePlusCommissionProgrammer basePlusCommissionProgrammer = new BasePlusCommissionProgrammer("John", "Mark",
				"234-44-5678", 3, 1978, 9000, .04, 300);
		ActionProgrammer actionProgrammer = new ActionProgrammer("Justin", "Bieber", "555-44-1234", 6, 1978, 19.50, 25);

		System.out.println("Programmers are processed individually:\n");

		System.out.printf("%s\n%s: $%,.2f\n\n", salariedProgrammer, "earned", salariedProgrammer.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyProgrammer, "earned", hourlyProgrammer.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionProgrammer, "earned", commissionProgrammer.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionProgrammer, "earned",
				basePlusCommissionProgrammer.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", actionProgrammer, "earned", actionProgrammer.earnings());

		/** create and initialize the programmer array */

		// TO DO: COMPLETE THIS PORTION. INSERT YOUR OWN CODE:
		// create the Programmer array elements as required.
		// Hint: How many elements array do you need to create? DO SO HERE!!!

		// START
		// INSERT CODE

		/**
		 * Programmer array to include all the subclass objects.
		 */
		Programmer[] programmer = { salariedProgrammer, hourlyProgrammer, commissionProgrammer,
				basePlusCommissionProgrammer, actionProgrammer };

		// END

		// IMPLEMENT THE USE OF A SCANNER TO GET THE CURRENT MONTH. COMPLETE THIS
		// PORTION!!!!
		// START
		// INSERT SCANNER CODE

		// END

		// TO DO: GET AND VALIDATE THE CURRENT MONTH. COMPLETE THIS PORTION!!!!
		Scanner input = new Scanner(System.in);
		String go = "yes";
		int month = 0;
		/**
		 * while loop to the test the month input.
		 */
		while (go.equals("yes")) {

			System.out.print("Enter the current month (1 - 12): ");
			month = input.nextInt();

			if (month < 1 || month > 12) {
				System.out.print("Error renter date!!!\n\r");
			} else
				go = "no";
		}

		// START
		// INSERT CODE

		// END

		System.out.println("");

		System.out.println("Programmers processed polymorphically:\n");

		// generically process each element in array
		
		/**
		 * Loop Through an Array with For-Each Loop. used exclusively to loop through
		 * elements in arrays.
		 */
		for (Programmer currentProgrammer : programmer) {
			System.out.println(currentProgrammer); // invokes toString

			// determine whether element is a BasePlusCommissionProgrammer
			/**
			 * instanceof to test whether currentProgrammer is an object of
			 * BasePlusCommisionProgrammer.
			 */
			if (currentProgrammer instanceof BasePlusCommissionProgrammer) {
				// downcast Programmer reference to
				// BasePlusCommissionProgrammer reference
				BasePlusCommissionProgrammer programmers = (BasePlusCommissionProgrammer) currentProgrammer;

				double oldBaseSalary = programmers.getBaseSalary();
				programmers.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmers.getBaseSalary());
			}

			// TO DO: COMPLETE THIS PORTION: if this is the month of the programmer's
			// birthday, add $500 to his salary
			// otherwise just state what this programmer currently earned.

			System.out.printf("earned $%,.2f ", currentProgrammer.earnings());
			/**
			 * validating if month entered is the birth month of the prorgrammer.
			 */
			if (month == currentProgrammer.getBirthDate().getMonth()) {

				System.out.printf("%s", "plus $500 birthday bonus");
			}
			System.out.println("\n");
		}

		// get type name of each object in programmers array
		for (int j = 0; j < programmer.length; j++) {
			System.out.printf("Programmer %d is a %s\n", j, programmer[j].getClass().getName());
		}
		input.close();
	}
}
