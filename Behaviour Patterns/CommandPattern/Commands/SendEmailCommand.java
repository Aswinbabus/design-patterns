package CommandPattern.Commands;

import java.time.LocalTime;

import CommandPattern.CommandSchedulerService;
import CommandPattern.LoggableCommand;
import CommandPattern.QueuableCommand;
import CommandPattern.RetryCommand;
import CommandPattern.Services.EmailService;
import CommandPattern.UndoableCommand;
import CommandPattern.models.Email;

public class SendEmailCommand implements LoggableCommand,UndoableCommand,RetryCommand,QueuableCommand
{

	private final EmailService emailService;
	private final Email email;
	private final CommandSchedulerService commandSchedulerService;
    private int scheduledTime;

	public SendEmailCommand(EmailService service, CommandSchedulerService schedulerService,Email email)
	{

		this.commandSchedulerService = schedulerService;
        this.emailService = service;
		this.email = email;
	}

	@Override
	public void execute()
	{
		emailService.sendMail(email);
	}


	@Override
	public void undo()
	{
         this.emailService.undoMail(email);
	}

	@Override
	public void retry()
	{
		this.emailService.sendMail(email);
	}

	@Override
	public void onQueue(int delayTime)
	{
		this.scheduledTime = LocalTime.now().getSecond() + delayTime;
	}

	@Override
	public String toString()
	{
		return "SendEmailCommand{" + "email=" + email + ", emailService=" + emailService + '}';
	}

	@Override
	public int getScheduledTime()
	{
		return scheduledTime;
	}

	@Override
	public CommandSchedulerService getService()
	{
		return commandSchedulerService;
	}


}
