package facadepattern;

public class BuildService
{
	private static BuildService instance = null;

	private BuildService() {


	}

	public static BuildService getInstance()
	{
		if(instance == null) {
			synchronized (BuildService.class) {
				if(instance == null) {
					instance = new BuildService();
				}
			}
		}

		return instance;
	}

	boolean compileCode(String code) {
		System.out.println("Compiling the code");
		return true;
	}

	boolean runUnitTest() {
		System.out.println("Running the unit test");
		return true;
	}

	boolean packageArtifact() {

		System.out.println("packing the artifact");
		return true;

	}

	boolean build() {

		if(compileCode("code")){

			if(runUnitTest()) {

				return packageArtifact();

			}

		}


		return false;


	}


}
