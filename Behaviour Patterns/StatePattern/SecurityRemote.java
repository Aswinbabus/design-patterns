package StatePattern;

public class SecurityRemote
{

	private final SecuritySystem securitySystem;
	private SecurityMode currMode;

	public SecurityRemote(SecuritySystem securitySystem) {
		this.securitySystem = securitySystem;
		currMode = DisArmedMode.getInstance();
		currMode.switchingMode(securitySystem);
	}

	public void switchMode(SecurityMode securityMode) {
		this.currMode = securityMode;
		currMode.switchingMode(securitySystem);
	}

	public String getCurrentMode() {
		return currMode.getMode();
	}

}
