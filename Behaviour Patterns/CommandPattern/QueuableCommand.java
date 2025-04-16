package CommandPattern;

import java.time.LocalTime;

public interface QueuableCommand extends Command,Comparable<QueuableCommand>
{
	default void queue(int delayTime) {
		 onQueue(delayTime);
		 getService().addCommand(this);
	}

	void onQueue(int delayTime);

	int getScheduledTime();

	CommandSchedulerService getService();

	@Override
	default int compareTo(QueuableCommand o)
	{
		return Integer.compare(getScheduledTime(),o.getScheduledTime());
	}
}
