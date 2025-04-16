package CommandPattern;

import java.time.LocalTime;

public interface LoggableCommand extends Command
{
	default void log() {
		// log the command centrally
		System.out.println("Executed Command  - " + this  + " at " + LocalTime.now());
	}
}
