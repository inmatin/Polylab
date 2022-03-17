
package polylab;

//LAB 6 - SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

/**
 * File Name: SalariedProgrammer.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 06<br>
 * Date: Mar 15th, 2022<br>
 * <p>
 */

/**
 * 
 * SalariedProgrammer.java (regular salaried programmers).<br>
 *
 */

public class SalariedProgrammer extends Programmer {
	private double weeklySalary;

//constructor
	/**
	 * 
	 * @param firstName            variable from the class Programmer.
	 * @param lastName             variable from the class Programmer.
	 * @param socialSecurityNumber variable from the class Programmer.
	 * @param month                variable from the class Programmer.
	 * @param year                 variable from the class Programmer.
	 * @param weeklySalary         variable of the programmer from class MyPaySystemTest2.
	 */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

//set salary

	/**
	 * 
	 * @param validate the weeklySalary for errors.
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

//return salary
	/**
	 * 
	 * @return the weekly salary of the Programmer.
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}

//calculate earnings; override abstract method earnings in Programmer
	/**
	 * 
	 * overriding the abstract method from class Programmer.
	 */
	@Override
	public double earnings() {
		return getWeeklySalary();
	}

//return String representation of SalariedProgrammer object   
	// TO DO: COMEPLETE THIS PORTION. Format your solution according to sample
	// output.
	/**
	 * 
	 * using printf to format the toString method. 
	 */
	@Override
	public String toString() {
		return String.format("salaried programmer: %s\n%s: $%,.2f ", super.toString(), "weekly salary",
				getWeeklySalary());

	}

}
