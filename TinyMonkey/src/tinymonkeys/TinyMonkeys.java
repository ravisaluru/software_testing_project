package tinymonkeys;

import tinymonkeys.controleur.Controller;

/**
 * Main Class, project execution starts from here.
 * 
 * @version 1.0
 * @author Guillaume
 *
 */
final public class TinyMonkeys 
{

	/**
	 * Default Constructor
	 */
	private TinyMonkeys() 
	{
	}
	
	/**
	 * Main Method.
	 * 
	 * @param args arguments.
	 */
	public static void main(String[] args)
	{
		final Controller controller = new Controller();
		controller.lanceEvolutionsPersonnages();
	}
	
}
