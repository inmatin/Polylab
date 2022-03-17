package polylab;

/**
 * File Name: ActionProgrammer.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 06<br>
 * Date: Mar 15th, 2022<br>
 * <p>
 */

public class ActionProgrammer extends Programmer {
	private double wage;
	private double pieces;

//contructor 
	/**
	 * 
	 * @param firstName            variable from the class Programmer.
	 * @param lastName             variable from the class Programmer.
	 * @param socialSecurityNumber variable from the class Programmer.
	 * @param month                variable from the class Programmer.
	 * @param yearvariable         from the class Programmer.
	 * @param wage                 variable for the the wage of the Action
	 *                             Programmer.
	 * @param pieces               variable for the piece of apps created by the
	 *                             Action Programmer.
	 */
	public ActionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double wage, double pieces) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) {// validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");

		}
		this.wage = wage;
		if (pieces < 0.0) {// validate pieces
			throw new IllegalArgumentException("Pieces must be >==0.0");

		}

		this.pieces = pieces;

	}

//set wage
	/**
	 * 
	 * @param wage the wage of the programmer.
	 */
	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >=0.0");
		}
		this.wage = wage;

	}

//return wage
	/**
	 * 
	 * @return gets the wage from the class MySystemTest2.
	 */
	public double getWage() {
		return wage;
	}

//set pieces
	/**
	 * 
	 * @param pieces the number of apps created by the programmer.
	 */
	public void setPiece(double pieces) {
		if (pieces < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >=0.0");
		}
		this.pieces = pieces;
	}

//return pieces
	/**
	 * 
	 * @return gets the number of apps created from the class MyPaySystemTest2.
	 */
	public double getPieces() {
		return pieces;
	}

	/**
	 * overrides the abstract method earnings and calculates the earnings of the
	 * programmer.
	 */
	@Override
	public double earnings() {
		return getWage() * getPieces();
	}

	/**
	 * overrides the toString method from class Programmer and object wage.
	 */
	@Override
	public String toString() {

		return String.format("action programmer: %s\n%s:$%,.2f; %s: %,.0f", super.toString(), "wage", getWage(),
				"apps created", getPieces());
	}
}