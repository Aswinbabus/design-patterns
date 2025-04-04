package MementoPattern;

import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Queue;

public class SavePointsManager
{

	private static final int MAX_SAVE_POINTS_COUNT  = 10;
	public static final int COOLOFF_SECONDS = 5;

	private Queue<SavePoint> savePoints;

	private long lastSavedTime = -1;

	public SavePointsManager() {
		savePoints = new ArrayDeque<>();
	}

	public void save(SavePoint savePoint) {

		long epochSecond = Instant.now().getEpochSecond();

		if(lastSavedTime == -1 || epochSecond - lastSavedTime > COOLOFF_SECONDS) {

			if(savePoints.size() == MAX_SAVE_POINTS_COUNT) {
				savePoints.poll();
			}

			savePoints.add(savePoint);
			lastSavedTime = epochSecond;

		}

	}

	public SavePoint restore() {

		if(savePoints.size() > 0)
		{
			return savePoints.poll();
		}

		return null;

	}


}
