
package polylab;

// THIS IS LAB 6 -  Date.java 

//Date class declaration.

/**
 * File Name: Date.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 06<br>
 * Date: Mar 15th, 2022<br>
 * <p>
 */

/**
 * Date.java (declaring the date useful for birthday of a programmer).<br>
 * 
 * Note that the programmers irrespective of what form of compensation they have
 * are paid only once every month.<br>
 *
 */

public class Date {
	private int month; // 1-12
	private int year; // any year

//constructor: confirm proper value for month given the year
	/**
	 * 
	 * @param month the month from the programmer date of birth.
	 * @param year  the year from the programmer date of birth.
	 */
	public Date(int month, int year) {
		// check if month in range
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		}

		this.month = month;
		this.year = year;

		System.out.printf("Date object constructor for date %s%n", this);
	}

// TO DO: COMPLETE THIS PORTION OF THE CODE (add get methods)!!!!!!!
//START
//INSERT CODE
	/**
	 * 
	 * @return the month from the programmer date of birth from the class Programmer.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 
	 * @return the year from the Programmer date of birth from the class Programmer.
	 */
	public int getYear() {
		return year;
	}
//END

// TO DO: ALSO COMPLETE THIS PORTION OF THE CODE!!!!: You are required to insert code to return a String of the form month/year.

	/**
	 * prints the birth month and birth year of the programmer.
	 */
	@Override
	public String toString() {
		return String.format("%s/%s ", getMonth(), getYear());
	}

// START
//INSERT CODE
//END

}
