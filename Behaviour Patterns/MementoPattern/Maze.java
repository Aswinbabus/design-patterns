package MementoPattern;

class Maze{

	private int xCoordinate;
	private int yCoordinate;

	public Maze(int xCoordinate, int yCoordinate)
	{
		this.yCoordinate = yCoordinate;
		this.xCoordinate = xCoordinate;
	}

	public int getxCoordinate()
	{
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate)
	{
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate()
	{
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate)
	{
		this.yCoordinate = yCoordinate;
	}

	public void moveUp(int noOfSteps) {

		yCoordinate += noOfSteps;

	}

	public void moveDown(int noOfSteps) {

		if(yCoordinate < noOfSteps)
		{
			yCoordinate = 0;
		}
		else
		{
			yCoordinate -= noOfSteps;
		}

	}

	public void moveLeft(int noOfSteps) {

		if(xCoordinate < noOfSteps) {
			xCoordinate = 0;
		}
		else
		{
			xCoordinate -= noOfSteps;
		}

	}

	public void moveRight(int noOfSteps) {

		xCoordinate += noOfSteps;

	}

	public SavePoint save() {
		return new SavePoint(xCoordinate,yCoordinate);
	}

	public void restore(SavePoint savePoint) {

		if(savePoint != null)
		{
			this.xCoordinate = savePoint.getxCoordinate();
			this.yCoordinate = savePoint.getyCoordinate();
		}
	}

}