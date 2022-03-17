package polylab;

//Programmer abstract superclass.

/**
 * File Name: Programmer.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 06<br>
 * Date: Mar 15th, 2022<br>
 * <p>
 */

/**
 * Programmer.java (programmer working in a company).<br>
 * 
 * this program focuses on abstract classes, inheritance and polymorphism.<br>
 * implement polymorphic behaviour in given scenarios.<br>
 * 
 * superclass Programmer has been extended by several subclasses.<br>
 * method earnings is required to be implemented polymorphically across
 * classes.<br>
 * the program focuses on how the classes connect, the logic and the hierarchy
 * among the given classes.<br>
 * 
 */

public abstract class Programmer {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	/**
	 * object data type.
	 */
	private final Date birthDate;

//constructor
	/**
	 * 
	 * @param firstName            the first name of the programmer.
	 * @param lastName             the last name of the programmer.
	 * @param socialSecurityNumber the social security number of the programmer.
	 * @param month                the month from the date of birth.
	 * @param year                 the year from the date of birth.
	 */
	public Programmer(String firstName, String lastName, String socialSecurityNumber, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = new Date(month, year);

	}

//return first name

//TO DO: INSERT YOUR CODE HERE

	/**
	 * 
	 * @return get the first name of the programmer from the class MyPaySystemTest.
	 */
	public String getFirstName() {
		return firstName;
	}

//return last name

//TO DO: INSERT YOUR CODE HERE 

	/**
	 * 
	 * @return the last name of the programmer from the class MyPaySystemTest.
	 */
	public String getLastName() {
		return lastName;
	}

//return social security number

//TO DO: INSERT YOUR CODE HERE
	/**
	 * 
	 * @return the social security number of the programmer from the class
	 *         MyPaySystemTest.
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

//return birth date  // 

//TO DO: INSERT YOUR CODE HERE
	/**
	 * 
	 * @return the birth date of the programmer with month and year parameters from
	 *         the class MyPaySystemTest.
	 */
	public Date getBirthDate() {
		return birthDate;
	}

//return String representation of Programmer object

	@Override
	/**
	 * toString method to print first name, last name, social security number and
	 * birth date of the programmer.
	 */
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), "social security number",
				getSocialSecurityNumber(), "birth month and year", getBirthDate());
	}

	/**
	 * 
	 * abstract method to be overridden by concrete subclasses
	 */
	public abstract double earnings();
}

/**
 * Reference:<br>
 * https://www.javatpoint.com/java-int-to-string
 * https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
 * https://www.javatpoint.com/downcasting-with-instanceof-operator
 * https://www.w3schools.com/java/java_interface.asp
 * https://www.geeksforgeeks.org/concrete-class-in-java/
 * https://taylorial.com/cs1021/UMLClass.htm
 * https://www.geeksforgeeks.org/data-types-in-java/
 */
