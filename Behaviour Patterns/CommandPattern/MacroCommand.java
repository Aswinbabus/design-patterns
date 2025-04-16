package CommandPattern;

import java.util.List;

public class MacroCommand implements Command
{

	private final List<Command> commands;

	public MacroCommand(List<Command> commands)
	{
		this.commands = commands;
	}

	void addCommand(Command command) {
		commands.add(command);
	}

	void removeCommand(Command command) {
		commands.remove(command);
	}

	@Override
	public void execute()
	{
		for(Command command : commands) {
			command.execute();
		}
	}
}
