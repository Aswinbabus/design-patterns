package facadepattern;

public class GitService
{

	private static GitService instance = null;

	private GitService() {

	}

	public static GitService getInstance()
	{

		if(instance == null) {
			synchronized (GitService.class) {

				if(instance == null) {
					instance = new GitService();
				}

			}
		}

		return instance;

	}

	boolean pullLatestCode() {

		System.out.println("Pulling the latest branch code");
		return true;
	}

	boolean checkoutSpecificBranch() {

		System.out.println("Checking out to specific branch");
	    return true;
	}

	boolean updateSourceControl() {

		return pullLatestCode() && checkoutSpecificBranch();

	}


}
