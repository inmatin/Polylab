package assignment1.Action.sec302;

import java.util.Scanner;

/**
 * In this file, you are required to write code for your part Part 3. The reason
 * for this class is to demonstrate the Action class and subclasses. You must
 * fill an array of action objects (hint: check the sample output file provided
 * for you) with different action activities. A user of this system should be
 * able to input a date of their choice and retrieve an output of all activities
 * that would occur on that date. You should reuse the Action class and
 * RegularAction classes from Part I of your solution and then the
 * OccasionalAction and RareAction classes from your Part 2.
 */

/**
 * File Name: AllActionTest.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Assignment 01<br>
 * Date: Mar 7, 2022<br>
 * <p>
 * 
 * Purpose:<br>
 * This assignment focuses on the concept of inheritance, abstraction,
 * arrays.<br>
 * 
 * Class AllActionTest demonstrates the Action class and subclasses.<br>
 * An array of action object have been created to output different action
 * activities.<br>
 * User inputs a date of their choice and retrieve an output of all activities
 * that would occur on that date.<br>
 * 
 * <p>
 * Class List: {@link Action}, {@link RegularAction}, {@link OccasionalAction},
 * {@link RareAction}, {@link ActionDriver}, {@link ActionDriver2},
 * {@link AllActionTest}
 * 
 * <p>
 * 
 * @author Ishtiaque Matin, ID# 041042199
 * @version Modified: Mar 7, 2022
 * @since JDK 1.8
 * @see Action
 * @see RegularAction
 * @see OccasionalAction
 * @see RareAction
 * @see ActionDriver
 * @see ActionDriver2
 * @see AllActionTest
 * @see Scanner
 */
public class AllActionTest {

	/**
	 * Class AllActionTest demonstrates the Action class and subclasses.<br>
	 * An array of action object have been created to output different action
	 * activities.<br>
	 * 
	 * User inputs a date of their choice and retrieve an output of all activities
	 * that would occur on that date.<br>
	 * <p>
	 * 
	 * an Array of objects with different task which need to be completed on
	 * particular dates.<br>
	 * 
	 * RegularAction any time after 2020.<br>
	 * 
	 * OccassionalAction any time greater 15th day of the month.<br>
	 * 
	 * RareAction on month 06 and 12 and on the 20th day of the month.<br>
	 * 
	 * setting the class Action object description using an array.<br>
	 * 
	 * <p>
	 * 
	 * @param args command-line arguments.
	 * 
	 *             Class AllActionTest demonstrates the Action class and
	 *             subclasses.<br>
	 *             An array of action object have been created to output different
	 *             action activities.<br>
	 * 
	 *             User inputs a date of their choice and retrieve an output of all
	 *             activities that would occur on that date.<br>
	 *             <p>
	 * 
	 *             an Array of objects with different task which need to be
	 *             completed on particular dates.<br>
	 * 
	 *             RegularAction any time after 2020.<br>
	 * 
	 *             OccassionalAction any time greater 15th day of the month.<br>
	 * 
	 *             RareAction on month 06 and 12 and on the 20th day of the
	 *             month.<br>
	 * 
	 *             setting the class Action object description using an array.<br>
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String go = "yes";

		System.out.print("\nPART 3 \n\r");
		/**
		 * an Array of objects with different task which need to be completed on
		 * particular dates.<br>
		 * 
		 * RegularAction any time after 2020.<br>
		 * 
		 * OccassionalAction any time greater 15th day of the month.<br>
		 * 
		 * RareAction on month 06 & 12 and on the 20th day of the month.<br>
		 * 
		 * setting the class Action object description using an array.<br>
		 */
		Action object[] = { new RegularAction("Wash your Hands"), new RegularAction("Wear a mask"),
				new RegularAction("Sit two metters apart"), new OccasionalAction("Take a PCR Test"),
				new RareAction("Get a Booster") };

		/**
		 * while loop continues until go is "yes".
		 */
		while (go.equals("yes")) {

			/**
			 * fields to get input for date from user. need to add more commenting.
			 */

			System.out.print("\nEnter a date (like 2010 01 30): ");

			int year = input.nextInt();
			int month = input.nextInt();
			int day = input.nextInt();

			System.out.print("These are your action on " + month + "/" + day + "/" + year + " :\n\r");

			/**
			 * if true then incorrect date has been entered.
			 */
			if ((month > 12) || (year > 9999) || (day > 31)) {
				System.out.print("Error renter date!!!\n\r");
			} else {

				/**
				 * Loop Through an Array with For-Each Loop. used exclusively to loop through
				 * elements in arrays.
				 */
				for (Action task : object) {

					/**
					 * if condition is true then task will be printed.
					 */
					if (task.occursOn(year, month, day) == true) {
						System.out.println(" - " + task.toString());
					}
				}

				System.out.print("\nContinue entering new dates? Y/N: ");

				/**
				 * skip the newline character
				 */
				input.nextLine();
				go = input.nextLine();

				/**
				 * if true then continue with loop.
				 */
				if (go.equals("y") || go.equals("Y")) {

					go = "yes";

					/**
					 * else end program.
					 */
				} else {
					go = "no";
					System.out.print("\nProgram has ended");
				}
			}

		}
		/**
		 * close the input scanner
		 * 
		 */
		input.close();

	}
}

/**
 * Reference:<br>
 * https://www.w3schools.com/java/java_arrays.asp<br>
 * http://tutorials.jenkov.com/java-collections/set.html<br>
 */
