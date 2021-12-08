import becker.robots.City;
import becker.robots.Direction;

/**
 * 
 * @author Mohammad
 *
 */

public class RobotTask {
	/**
	 * 
	 */
	public void run()
	{

		int blocks; //keeps track of number of blocks moved

		//build a city
		City Mohammad = new City();
		//Thing t = new (Mohammad,0,0);
		//t.setColor(0,0,0);
		//shows the number of things on each corner
		Mohammad.showThingCounts(true);

		NamePlanter NP;
		NP = new Mplanter(Mohammad,7,0,Direction.NORTH,50);
		NP.TypeMyName();

		NP = new Oplanter(Mohammad,7,6,Direction.NORTH,50);
		NP.TypeMyName();

		NP = new Hplanter(Mohammad,7,12,Direction.NORTH,50);
		NP.TypeMyName();

		NP = new Aplanter(Mohammad,7,18,Direction.NORTH,50);
		NP.TypeMyName();

		NP = new Mplanter(Mohammad,13,0,Direction.NORTH,50);
		NP.TypeMyName();

		NP = new Mplanter(Mohammad,13,6,Direction.NORTH,50);
		NP.TypeMyName();

		NP = new Aplanter(Mohammad,13,12,Direction.NORTH,50);
		NP.TypeMyName();

		NP = new Dplanter(Mohammad,13,18,Direction.NORTH,50);
		NP.TypeMyName();
		
	}
}
