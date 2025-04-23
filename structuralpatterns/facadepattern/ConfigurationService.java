package facadepattern;

public class ConfigurationService
{

	private static ConfigurationService instance = null;

	private ConfigurationService() {

	}

	public static ConfigurationService getInstance()
	{
		if(instance == null) {
			synchronized (ConfigurationService.class) {
				if(instance == null) {

					instance = new ConfigurationService();

				}
			}
		}

		return instance;
	}

	boolean loadEnvironmentVariables(String type) {
		System.out.println("Loading the environment variables " + type);
		return true;
	}

	boolean replacePlaceHolders() {
		System.out.println("Replacing the placeholders");
		return true;
	}

	boolean executeConfig() {

		return loadEnvironmentVariables("prod") && replacePlaceHolders();

	}

}
