package CommandPattern.Commands;

import CommandPattern.LoggableCommand;
import CommandPattern.Services.ReportsAPI;

public class GenerateReport implements LoggableCommand
{
	private final ReportsAPI reportsAPI;
    private final String reportName;
	private String filePath;

	public GenerateReport(ReportsAPI reportsAPI,String reportName)
	{
		this.reportsAPI = reportsAPI;
		this.reportName = reportName;
	}

	@Override
	public void execute()
	{
		reportsAPI.generateReport(reportName);
	}
}
