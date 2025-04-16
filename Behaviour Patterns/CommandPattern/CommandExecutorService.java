package CommandPattern;

import java.util.concurrent.ExecutorService;

public class CommandExecutorService
{

	private ExecutorService executorService;

	public CommandExecutorService(ExecutorService executorService)
	{
		this.executorService = executorService;
	}

	public void submitCommand(Command command) {
		executorService.submit(command::execute);
	}

}
