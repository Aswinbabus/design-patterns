package StatePattern.Learn;

// driver class
public class SecurityContext
{

	private SecurityMode currentMode;


	void onStateChange(SecurityMode mode) {
		currentMode.onStateChange(this,mode);
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
