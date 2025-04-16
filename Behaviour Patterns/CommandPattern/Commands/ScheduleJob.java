package CommandPattern.Commands;

import CommandPattern.Services.JobService;
import CommandPattern.UndoableCommand;

public class ScheduleJob implements UndoableCommand
{

	private final JobService service;
	private final String jobName;
	private int jobId;

	public ScheduleJob(JobService service,String jobName)
	{
		this.service = service;
		this.jobName = jobName;
	}


	@Override
	public void execute()
	{
       service.scheduleJob(jobName);
	}

	@Override
	public void undo()
	{
		service.removeJob(jobId);
	}

	@Override
	public String toString()
	{
		return "ScheduleJob{" + "jobId=" + jobId + ", jobName='" + jobName + '\'' + '}';
	}
}
