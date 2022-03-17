
package polylab;

// LAB 6 - HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.

/**
 * File Name: HourlyProgrammer.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 06<br>
 * Date: Mar 15th, 2022<br>
 * <p>
 */

/**
 * 
 * HourlyProgrammer.java (programmers who are paid per hour).<br>
 *
 */

public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week

//constructor
	/**
	 * 
	 * @param firstName            variable from the class Programmer.
	 * @param lastName             variable from the class Programmer.
	 * @param socialSecurityNumber variable from the class Programmer.
	 * @param month                variable from the class Programmer.
	 * @param year                 variable from the class Programmer.
	 * @param wage                 variable from the class MyPaySystemTest.
	 * @param hours                variable from the class MyPaySystemTest.
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	}

//set wage
	/**
	 * 
	 * @param wage set the variable wage in the class HourlyProgrammer.
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	}

//return wage
	/**
	 * 
	 * @return gets the variable wage from the class MyPaySystemTest.
	 */
	public double getWage() {
		return wage;
	}

//set hours worked
	/**
	 * 
	 * @param hours sets the variable hours in the class HourlyProgrammer.
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}

//return hours worked
	public double getHours() {
		return hours;
	}

//calculate earnings; override abstract method earnings in Programmer
	
	/**
	 * override the abstract method earnings to calculate wage.
	 */
	@Override
	public double earnings() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

//return String representation of HourlyProgrammer object    
	/**
	 * prints toString method from the class Programmer and adds the object wage.
	 */
	@Override
	public String toString() {

		return String.format("hourly programmer: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}

//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END

}
