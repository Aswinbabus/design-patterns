package MementoPattern;

public class GameEngine
{


	public static void main(String[] args)
	{

		Maze maze = new Maze(0,0);

		SavePointsManager savePointsManager = new SavePointsManager();

		maze.moveUp(100);
		maze.moveRight(350);

		savePointsManager.save(maze.save());

		maze.moveDown(50);
		maze.moveLeft(150);

		maze.restore(savePointsManager.restore());

		System.out.println("Current co-ordinates : " + " x - " + maze.getxCoordinate() + " , y - "+ maze.getyCoordinate());

	}

}
