package CommandPattern.Services;

import java.util.Random;

public class ReportsAPI
{

	public String generateReport(String reportName) {

		// generating report and return the report filename
		return "report" + new Random().nextInt(1000) + ".pdf";

	}

}
