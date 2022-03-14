package assignment1.Action.sec302;

/**
 * This is the Action Superclass class that provides a catalog of actions to be
 * carried out in view of COVID-19 OPH protocols. You are required to complete
 * read and review this code to appropriately fill the required loopholes.
 */

/**
 * File Name: Action.java<br>
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
 * Class Action Superclass provides a catalog of actions to be carried out.<br>
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
public abstract class Action {
	private String description;

	/**
	 * constructs Action set object description to blank.<br>
	 * used by subclasses to set object description.<br>
	 */
	public Action() {
		description = "";
	}

	/**
	 * Sets the description of this action.<br>
	 * using method setDescription to set description object.<br>
	 * 
	 * @param description the text description of the action.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * YOUR TASK - TO DO: Write your abstract method named occursOn() here.
	 */

	/**
	 * Determines if this action occurs on the specified date.<br>
	 * using abstract method occursOn with defined year, month, day.<br>
	 * it is extended to the subclass RegularAction, OccasionalAction and
	 * RareAction.<br>
	 * 
	 * @param year  the year
	 * @param month the month
	 * @param day   the day
	 * @return true if the action activity occurs on the specified date.
	 */

	public abstract boolean occursOn(int year, int month, int day);

	/**
	 * Converts action activity to string description.<br>
	 * using toString method to output description.<br>
	 */
	public String toString() {
		return description;
	}
}
