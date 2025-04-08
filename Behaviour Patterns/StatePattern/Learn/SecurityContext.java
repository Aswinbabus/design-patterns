package StatePattern.Learn;

// driver class
public class SecurityContext
{

	private SecurityMode currentMode;

	void disArmedMode() {
		currentMode.disArmedMode(this);
	}

	void armedWithHome() {
		currentMode.armedWithHome(this);
	}

	void armedWithAway() {
		currentMode.armedWithAway(this);
	}

	void alertMode(){
		currentMode.alertMode(this);
	}


	void onMotionDetected() {
		currentMode.handleMotionDetected(this);
	}

	void onDoorOpened() {
		currentMode.handleDoorOpened(this);
	}


	protected void setCurrentMode(SecurityMode currentMode)
	{
		this.currentMode = currentMode;
		currentMode.initializeMode();

	}
}
