package assignment1.Action.sec302;

import java.lang.reflect.Field;

/**
 * File Name: ActionDriver2.java<br>
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
 * <p>
 * java reflection is process of examining or modifying the run time behavior of
 * a class at run time.<br>
 * <p>
 * test class OccasionalAction is a subclass of superclass Action.<br>
 * test class RareAction is a subclass of superclass Action.<br>
 * test fields of class OccasionalAction by restricting field length to 0.<br>
 * test fields of class RareAction by restricting field length to 0.<br>
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
 */
public class ActionDriver2 {

	/**
	 * java reflection is process of examining or modifying the run time behavior of
	 * a class at run time.<br>
	 * 
	 * test class OccasionalAction is a subclass of superclass Action.<br>
	 * 
	 * test class RareAction is a subclass of superclass Action.<br>
	 * 
	 * test fields of class OccasionalAction by restricting field length to 0.<br>
	 * 
	 * test fields of class RareAction by restricting field length to 0.<br>
	 * 
	 * if test passes output true.<br>
	 * 
	 * <p>
	 * examining the class testing class OccasionalAction is a subclass of
	 * superclass Action.<br>
	 * examining the class testing class RareAction is a subclass of superclass
	 * Action.<br>
	 * examining the fields.<br>
	 * testing field length to establish there are no fields.<br>
	 * 
	 * @param args command-line arguments.
	 * 
	 *             java reflection is process of examining or modifying the run time
	 *             behavior of a class at run time.<br>
	 * 
	 *             test class OccasionalAction is a subclass of superclass
	 *             Action.<br>
	 * 
	 *             test class RareAction is a subclass of superclass Action.<br>
	 * 
	 *             test fields of class OccasionalAction by restricting field length
	 *             to 0.<br>
	 * 
	 *             test fields of class RareAction by restricting field length to
	 *             0.<br>
	 * 
	 *             if test passes output true.<br>
	 * 
	 *             <p>
	 *             examining the class testing class OccasionalAction is a subclass
	 *             of superclass Action.<br>
	 *             examining the class testing class RareAction is a subclass of
	 *             superclass Action.<br>
	 *             examining the fields.<br>
	 *             testing field length to establish there are no fields.<br>
	 * 
	 */
	public static void main(String[] args) {

		System.out.print("\nPART 2 \n\r");

		System.out.print("OccasionalAction is just a subclass of Action:");

		Class<?> occasional = OccasionalAction.class;
		Class<?> rare = RareAction.class;
		Class<?> action = Action.class;

		/**
		 * examining the class testing class OccasionalAction is a subclass of
		 * superclass Action.<br>
		 */

		if (occasional.getSuperclass() == action) {
			System.out.println(true);
		}

		System.out.println("Expected: true");

		/**
		 * examining the class testing class RareAction is a subclass of superclass
		 * Action.<br>
		 * 
		 */
		System.out.print("\nRareAction is just a subclass of Action:");

		if (rare.getSuperclass() == action) {
			System.out.println(true);
		}
		System.out.println("Expected: true");

		/**
		 * examining the fields.<br>
		 * testing field length to establish there are no fields.<br>
		 */
		System.out.print("\nOccasionalAction activities have no extra fields:");

		Field field1[] = occasional.getDeclaredFields();
		if (field1.length == 0) {
			System.out.println(true);

		}
		System.out.println("Expected: true");

		/**
		 * examining the fields.<br>
		 * testing field length to establish there are no fields.<br>
		 */
		System.out.print("\nRareAction activities have no extra fields:");

		Field field2[] = rare.getDeclaredFields();
		if (field2.length == 0) {
			System.out.println(true);

		}
		System.out.println("Expected: true");
	}

}
