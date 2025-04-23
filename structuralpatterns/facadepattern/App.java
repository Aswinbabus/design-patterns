package facadepattern;

public class App
{
	public static void main(String[] args)
	{

		DeploymentFacade deploymentFacade = DeploymentFacade.getInstance();

		deploymentFacade.deploy();

	}
}
