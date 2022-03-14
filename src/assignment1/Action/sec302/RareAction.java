package assignment1.Action.sec302;

/**
 * In this file you will provide the code solution for Part 2. You are required
 * to create a subclass named RareAction. Activities for RareAction occurs on a
 * particular date of the year specified.
 */

/**
 * File Name: RareActionTest.java<br>
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
 * Class RareAction is another subclass of the superclass Action.<br>
 * 
 * This class outputs activities that occurs on a particular date of the year
 * specified.<br>
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
 */

public class RareAction extends Action {

	/**
	 * constructor RareAction passes the description of the action.<br>
	 * constructor RareAction get the object description from superclass Action.<br>
	 * constructor RareAction set object description in superclass Action.<br>
	 * 
	 * @param description task to be completed.
	 */
	public RareAction(String description) {
		super();
		this.setDescription(description);
	}

	/**
	 * override the occursOn method from superclass Action.<br>
	 * get object year, month and day.<br>
	 * validates conditions required to output object description.<br>
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
		/**
		 * RareAction class, the day, month and year are required.
		 * 
		 * RareAction depicts actions that take place only once on a specified day of
		 * the year.
		 */
		if ((month == 06 || month == 12) && (year >= 2020) && (day == 20)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * overrides the toString method.<br>
	 * gets object description from the superclass Action.<br>
	 * outputs object description.<br>
	 */
	@Override
	public String toString() {

		return super.toString();
	}

}
