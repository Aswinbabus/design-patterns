package SingletonPattern;

public class GlobalConfig
{

	private static volatile GlobalConfig instance;

	private String databaseUrl;
	private Integer cacheTTL;
	private String FeatureFlags;
	private Integer rateLimit;
	private String LogLevel;

	// error
	public GlobalConfig()
	{
		loadConfigurationFromFile();
	}


	public static GlobalConfig getInstance() {

		if(instance == null) {

			synchronized(GlobalConfig.class) {

				if(instance == null) {

					instance = new GlobalConfig();

				}

			}
		}

		return instance;

	}

	// load instead of creating
	public void refresh() {

		synchronized (GlobalConfig.class) {
			System.out.println("Logging the refresh time");
			instance = new GlobalConfig();
		}

	}

	public void override(String key,Object Value) {
		// override the config values
		instance.setCacheTTL(234);
	}

	private void loadConfigurationFromFile()
	{
		// parse the configuration file and loads the value
	}

	private void setCacheTTL(Integer cacheTTL)
	{
		this.cacheTTL = cacheTTL;
	}

	private void setDatabaseUrl(String databaseUrl)
	{
		this.databaseUrl = databaseUrl;
	}

	private void setFeatureFlags(String featureFlags)
	{
		FeatureFlags = featureFlags;
	}

	private void setLogLevel(String logLevel)
	{
		LogLevel = logLevel;
	}

	private void setRateLimit(Integer rateLimit)
	{
		this.rateLimit = rateLimit;
	}

	public Integer getCacheTTL()
	{
		return cacheTTL;
	}

	public String getDatabaseUrl()
	{
		return databaseUrl;
	}

	public String getFeatureFlags()
	{
		return FeatureFlags;
	}

	public String getLogLevel()
	{
		return LogLevel;
	}

	public Integer getRateLimit()
	{
		return rateLimit;
	}
}
