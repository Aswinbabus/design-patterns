package MementoPattern;

public class SavePoint
{
	private final int xCoordinate;
	private final int yCoordinate;

	public SavePoint(int xCoordinate, int yCoordinate)
	{
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public int getxCoordinate()
	{
		return xCoordinate;
	}

	public int getyCoordinate()
	{
		return yCoordinate;
	}
}
