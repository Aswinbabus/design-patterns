package facadepattern;

public class DeploymentFacade
{

	private static DeploymentFacade facade = null;
	private static BuildService buildService;
	private static ConfigurationService configurationService;
	private static GitService gitService;

	private DeploymentFacade() {

		buildService = BuildService.getInstance();
		configurationService = ConfigurationService.getInstance();
		gitService = GitService.getInstance();


	}

	public static DeploymentFacade getInstance()
	{
		if(facade == null) {
			synchronized (DeploymentFacade.class) {
				if(facade == null) {
					facade = new DeploymentFacade();
				}
			}
		}

		return facade;
	}

	void uploadArtifact() {
		System.out.println("Uploading artifact to remote server");
	}

	void restartContainer() {
		System.out.println("Restart container");
	}

	void logging() {
		System.out.println("Logging the deployment");
	}

	void deploy() {

		// source control
		if(gitService.updateSourceControl()) {
			// build phase
			if (buildService.build())
			{
                //configuration management
				if(configurationService.executeConfig()) {

					uploadArtifact();
					restartContainer();
					logging();

				}
			}
		}

	}

}
