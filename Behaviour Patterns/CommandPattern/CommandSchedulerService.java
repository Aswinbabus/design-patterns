package CommandPattern;

import java.util.PriorityQueue;

public class CommandSchedulerService
{

	private PriorityQueue<Command> commandQueue = new PriorityQueue<>();

	public void addCommand(Command command) {
		commandQueue.add(command);
	}

	// triggered asynchronously
	public void executeCommands() {
		while(!commandQueue.isEmpty()) {
			Command command = commandQueue.poll();
			command.execute();
			if(command instanceof LoggableCommand) {
				((LoggableCommand) command).log();
			}
		}
	}

}
