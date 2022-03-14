package assignment1.Action.sec302;

import java.lang.reflect.Field;

/**
 * File Name: ActionDriver.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Assignment 01<br>
 * Date: Mar 7, 2022<br>
 * <p>
 * 
 * 
 * Purpose:<br>
 * This assignment focuses on the concept of inheritance, abstraction,
 * arrays.<br>
 * 
 * <p>
 * java reflection is process of examining or modifying the run time behavior of
 * a class at run time.<br>
 * 
 * <p>
 * test class RegularAction is a subclass of superclass Action.<br>
 * test fields of class RegularAction by restricting field length to 0.<br>
 * test object of class RegularAction by executing toString method.<br>
 * if test passes output true.<br>
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
 * @see Class
 * @see Field
 *
 */
public class ActionDriver {

	/**
	 * 
	 * test class RegularAction is a subclass of superclass Action.<br>
	 * 
	 * test fields of class RegularAction by restricting field length to 0.<br>
	 * 
	 * test object of class RegularAction by executing toString method.<br>
	 * 
	 * if test passes output true.<br>
	 * 
	 * <p>
	 * 
	 * examining the superclass. testing class RegularAction is a subclass of
	 * superclass Action.<br>
	 * examining the superclass.<br>
	 * testing class RegularAction is a subclass of superclass Action.<br>
	 * examining the objects.<br>
	 * testing object in class RegularAction by executing by toString method.<br>
	 * 
	 * @param args command-line arguments.
	 * 
	 *             test class RegularAction is a subclass of superclass Action.<br>
	 * 
	 *             test fields of class RegularAction by restricting field length to
	 *             0.<br>
	 * 
	 *             test object of class RegularAction by executing toString
	 *             method.<br>
	 * 
	 *             if test passes output true.<br>
	 * 
	 *             <p>
	 * 
	 *             examining the superclass. testing class RegularAction is a
	 *             subclass of superclass Action.<br>
	 *             examining the superclass.<br>
	 *             testing class RegularAction is a subclass of superclass
	 *             Action.<br>
	 *             examining the objects.<br>
	 *             testing object in class RegularAction by executing by toString
	 *             method.<br>
	 */
	public static void main(String[] args) {

		System.out.print("\nPART 1\n\r");

		Class<?> regular = RegularAction.class;
		Class<?> action = Action.class;

		/**
		 * examining the superclass.<br>
		 * testing class RegularAction is a subclass of superclass Action.<br>
		 */
		System.out.print("\nRegularAction is just a subclass of Action: ");

		if (regular.getSuperclass() == action) {
			System.out.println(true);
		}

		System.out.println("Expected: true");

		/**
		 * examining the fields. testing field length to establish there are no
		 * fields.<br>
		 */

		System.out.print("\nRegularAction activities have no extra fields: ");

		Field field[] = regular.getDeclaredFields();
		if (field.length == 0) {
			System.out.println(true);
		}

		System.out.println("Expected: true");
		/**
		 * examining the objects.<br>
		 * testing object in class RegularAction by executing by toString method.<br>
		 */
		RegularAction regularObj = new RegularAction(" Wash your hands");

		System.out.print("\nLooking at regular actions:" + regularObj.toString());

		System.out.println("\nExpected - Wash your hands: " + regularObj.occursOn(2020, 0, 0));

		System.out.println("Expected: true");

	}

}

/**
 * Reference:<br>
 * https://www.baeldung.com/java-reflection<br>
 * https://www.javatpoint.com/java-reflection
 */
