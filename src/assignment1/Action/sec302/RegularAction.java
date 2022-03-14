package assignment1.Action.sec302;

/**
 * This is code for Part 1. YOUR TASK is to create a subclass named
 * RegularAction. This is a subclass of the Action Superclass. Action has a
 * description (for example, "Wash your hands") and occurss on one or more
 * dates. A regularaction activity occurs every day.
 */

/**
 * File Name: RegularAction.java<br>
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
 * Class RegularAction is a subclass of the Action superclass show a Sales Agent
 * with a name and age.<br>
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

public class RegularAction extends Action {

	/**
	 * constructor RegularAction passes the description of the action.<br>
	 * constructor RegularAction get the object description from superclass
	 * Action.<br>
	 * constructor RegularAction set object description in superclass Action.<br>
	 * 
	 * @param description task to be completed.
	 * 
	 */
	public RegularAction(String description) {
		super();
		this.setDescription(description);
	}

	/**
	 * override the occursOn method from superclass Action.<br>
	 * get object year, month and day.<br>
	 * validates conditions required to output object description.<br>
	 * 
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {

		/**
		 * returns true if year is greater than or equal 2020.
		 */
		if (year >= 2020) {
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

/**
 * Reference:<br>
 * https://www.w3schools.com/java/ref_keyword_this.asp<br>
 */
