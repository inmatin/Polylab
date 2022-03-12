
package polylab;

//Programmer abstract superclass.

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
 *
 * 
 */

public abstract class Programmer {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final int month;
	private final int year;

	/**
	 * idea to make int array. convert the int to string.
	 */

//constructor
	public Programmer(String firstName, String lastName, String socialSecurityNumber, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.month = month;
		this.year = year;
	}

//return first name

//TO DO: INSERT YOUR CODE HERE

	public String getFirstName() {
		return firstName;
	}

//return last name

//TO DO: INSERT YOUR CODE HERE 

	public String getLastName() {
		return lastName;
	}

//return social security number

//TO DO: INSERT YOUR CODE HERE

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

//return birth date  // 

//TO DO: INSERT YOUR CODE HERE

	public int getBirthMonth() {
		return month;
	}
	
	public int getBirthYear() {
		return year;
	}

//return String representation of Programmer object
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), "social security number",
				getSocialSecurityNumber(), "birth month and year", getBirthMonth(), getBirthYear());
	}

	/** abstract method must be overridden by concrete subclasses */

	public abstract double earnings();
}

/**
 * https://www.javatpoint.com/java-int-to-string
 * https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
 */
