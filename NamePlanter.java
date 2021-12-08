import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;  //imports the java awt color interface
import becker.robots.Intersection;
import becker.robots.Robot;

public abstract class NamePlanter extends RobotSE{
	/**
	 * parent class extends RobotSE class capabilities
	 * @param arg0 - city
	 * @param arg1 - initial street
	 * @param arg2 - initial avenue
	 * @param arg3 - initial direction
	 * @param arg4 - initial things robot has
	 */
	// create a new state for items Putted
	protected int itemsPutted;

	// create a new state for blocks moved
	private int blocksMoved;

	public NamePlanter(City arg0, int arg1, int arg2, Direction arg3, int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		// TODO Auto-generated constructor stub
	}

	public void TypeMyName() {
		/**
		 * gives the sign to the child class to perform the task based on the command from the task class
		 */
		plantM();
		plantO();
		plantH();
		plantA();
		plantD();
	}

	/**
	 * Changes colour of robot 
	 */
	public void changeColor(int r, int g, int b) {
		// TODO Auto-generated method stub  r,g,b 0-255
		Color c = new Color(r, g, b);
		this.setColor(c);
	}

	protected void DiaNorth() {
		// TODO Auto-generated method stub
		/**
		 * goes north diagonally
		 */
		this.putThing();
		this.turnRight();
		move();
		this.turnLeft();
		move();
	}

	protected void DiaSouth() {
		// TODO Auto-generated method stub
		/**
		 * goes south diagonally
		 */
		this.putThing();
		this.turnLeft();
		move();
		this.turnRight();
		move();
		this.putThing();
	}

	protected void South() {
		// TODO Auto-generated method stub
		/**
		 * directs the robot to the south
		 */
		this.turnRight();
		move();
		this.turnRight();
		move();
	}


	protected void North() {
		// TODO Auto-generated method stub
		/**
		 * directs the robot to  the north
		 */
		this.turnLeft();
		move();
		this.turnLeft();
		move();		
	}

	protected void Line() {
		// TODO Auto-generated method stub
		/**
		 * plants a line
		 */
		putThing();
		move();
		putThing();
		move();
		putThing();
		move();
		putThing();
		move();
		putThing();
	}

	protected void smallerLine() {
		// TODO Auto-generated method stub
		/**
		 * plants a small line
		 */
		move();
		putThing();
		move();
		putThing();
		move();
		putThing();
	}
	protected void smallLine() {
		// TODO Auto-generated method stub
		/**
		 * plants a small line
		 */
		putThing();
		move();
		putThing();
		move();
		putThing();
		move();
		putThing();
		move();
	}

	protected void turnBack() {
		// TODO Auto-generated method stub
		/**
		 * turns the robot to the opposite side of its initial direction
		 */
		this.turnRight();
		this.turnRight();

	}
	public void putThing() {
		super.putThing();
		setItemsPutted(getItemsPutted() +1); //updates the number of items picked up
	}

	protected int getItemsPutted() {
		return itemsPutted;
	}

	protected void setItemsPutted(int itemsPutted) {
		this.itemsPutted = itemsPutted;
	}
	public void move() {
		super.move();
		changeColor(0,itemsPutted,0);
	}
	protected int getBlocksMoved() {
		return blocksMoved;
	}

	protected void setBlocksMoved(int blocksMoved) {
		this.blocksMoved = blocksMoved;
	}

	protected abstract void plantM();
	protected abstract void plantO();
	protected abstract void plantH();
	protected abstract void plantA();
	protected abstract void plantD();

}
