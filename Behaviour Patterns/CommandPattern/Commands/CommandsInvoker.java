package CommandPattern.Commands;


import java.util.concurrent.Executors;

import CommandPattern.CommandExecutorService;
import CommandPattern.CommandSchedulerService;
import CommandPattern.Services.EmailService;
import CommandPattern.Services.FileStorageService;
import CommandPattern.Services.JobService;
import CommandPattern.Services.ReportsAPI;

public class CommandsInvoker
{

	CommandExecutorService executorService;
	CommandSchedulerService schedulerService;
	EmailService emailService = new EmailService();
	FileStorageService fileStorageService = new FileStorageService();
	JobService jobService = new JobService();
	ReportsAPI reportsAPI = new ReportsAPI();

	public CommandsInvoker() {
		executorService = new CommandExecutorService(Executors.newSingleThreadExecutor());
		schedulerService = new CommandSchedulerService();
	}

	void sendMail(String mailId,String subject,String content) {

		SendEmailCommand command = new SendEmailCommand(emailService,email);

	}


}
