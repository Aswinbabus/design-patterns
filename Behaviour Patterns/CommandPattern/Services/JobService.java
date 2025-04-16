package CommandPattern.Services;

import java.util.Random;

public class JobService
{

	public int scheduleJob(String jobName) {

		// schedule job and send jobId
		return new Random().nextInt(1000);

	}

	public boolean removeJob(int jobId) {

		// remove job from schedule
		return true;

	}

}
