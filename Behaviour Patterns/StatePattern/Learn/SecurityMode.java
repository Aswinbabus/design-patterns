package StatePattern.Learn;

public abstract class SecurityMode
{
	 // Whether Switching from current state to newState is Allowed or Not (State Transition Logic)
	abstract void disArmedMode(SecurityContext context);
    abstract void armedWithHome(SecurityContext securityContext);
	abstract void armedWithAway(SecurityContext securityContext);
	abstract void alertMode(SecurityContext securityContext);

	// Modes can override if they need any mode initialization steps
	 void initializeMode(){

	 }

	 // State specific Behaviour Handling

	// default implementation - do nothing - to avoid mandating disarmed mode and alert mode to implement this methods
	 void handleMotionDetected(SecurityContext context) {
		 System.out.println("Ignore");
	 }

	 void handleDoorOpened(SecurityContext securityContext) {
		 System.out.println("Ignore");
	 }

	 // Mode Type Getter
	 abstract SecurityModes getModeType();

}
