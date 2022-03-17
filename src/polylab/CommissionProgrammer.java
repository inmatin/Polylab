
package polylab;

//CommissionProgrammer.java
//CommissionProgrammer class extends Programmer.

/**
 * File Name: CommissionProgrammer.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 06<br>
 * Date: Mar 15th, 2022<br>
 * <p>
 */

/**
 * 
 * CommissionProgrammer.java (programmers who are paid based on commission).<br>
 *
 */

public class CommissionProgrammer extends Programmer {
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

//constructor
	/**
	 * 
	 * @param firstName            the first name of the Programmer.
	 * @param lastName             the last name of the Programmer.
	 * @param socialSecurityNumber the social security number of the Programmer.
	 * @param month                the month of the Programmer.
	 * @param year                 the year of the Programmer.
	 * @param grossSales           the gross sales of the Programmer from class
	 *                             MyPaySystemTest.
	 * @param commissionRate       the commission rate of the Programmer from the
	 *                             class MyPaySystemTest.
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate) {

		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

//set gross sales amount on the creation of apps
	/**
	 * 
	 * @param validate the gross sales for errors.
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

//return gross sales amount 
	/**
	 * 
	 * @return the gross sales of the Programmer from the class MyPaySystemTest.
	 */
	public double getGrossSales() {
		return grossSales;
	}

//set commission rate
	/**
	 * 
	 * @param commissionRate the commission rate of the Programmer.
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

//return commission rate
	/**
	 * 
	 * @return the commission rate of the Programmer from the class MyPaySystemTest.
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

//calculate earnings; override abstract method earnings in Programmer

	/**
	 * override the abstract method earnings to calculate the total earnings of the programmer.
	 */
	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

//return String representation of CommissionProgrammer object
	
/**
 * prints the toString method of class Programmer and adds object gross sales and commission rate.
 */
	@Override
	public String toString() {
		return

		String.format("commission programmer: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "gross sales",
				getGrossSales(), "commission rate", getCommissionRate());
	}
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END

}
