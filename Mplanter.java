import java.awt.Color;

import becker.robots.City;
import becker.robots.Direction;

public class Mplanter extends NamePlanter {
	/**
	 * a child class extends NamePlanter class capabilities
	 * @param arg0 - City
	 * @param arg1 - initial street
	 * @param arg2 - initial avenue
	 * @param arg3 - initial direction
	 * @param arg4 - initial things robot has
	 */

	public Mplanter(City arg0, int arg1, int arg2, Direction arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		// TODO Auto-generated constructor stub
	}
	public void plantM() {
		/**
		 * Performs the task
		 */
		Line();
		South();
		DiaSouth();
		North();
		DiaNorth();
		turnBack();
		Line();
	}
	/**
	 * Changes colour of robot 
	 */
	public void changeColor(int r, int g, int b) {
		// TODO Auto-generated method stub  r,g,b 0-255
		Color c = new Color(r, g, b);
		this.setColor(c);
	}
	/**
	 * Changes colour of robot 
	 */
	public void move() {
		super.move();

		if(getStreet()%2!=0 && getAvenue()%2!=0){
			//changeColor(itemsPicked*getAvenue(),(turnRights*getStreet()),(blocksMoved+getAvenue()));
			changeColor(255,125,0);
		}

		if(getStreet()%2==0 && getAvenue()%2==0){
			changeColor(255,229,124);
		}
		
		if(getStreet()%2!=0 && getAvenue()%2==0){
			//changeColor(itemsPicked*getAvenue(),(turnRights*getStreet()),(blocksMoved+getAvenue()));
			changeColor(0,0,255);
		}

		if(getStreet()%2==0 && getAvenue()%2!=0){
			changeColor(27, 161, 226);
		}
	}

	@Override
	protected void plantO() {
		// TODO Auto-generated method stub

	}
	@Override
	protected void plantH() {
		// TODO Auto-generated method stub

	}
	@Override
	protected void plantA() {
		// TODO Auto-generated method stub

	}
	@Override
	protected void plantD() {
		// TODO Auto-generated method stub

	}

}
