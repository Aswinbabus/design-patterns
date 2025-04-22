package compositepattern;

import java.util.Arrays;

public class App
{

	public static void main(String[] args)
	{

		String aswin = "aswin";
		String prathi = "prathi";

		File f1 = new File("a.txt");

		File f2 = new File("a.html");
		File f3 = new File("b.html");
		File f4 = new File("c.html");

		Folder folder = new Folder("html",Arrays.asList(f2,f3,f4));

		Permission readOnly = new Permission(false,true,false);
		Permission all = new Permission(true,true,true);

		f1.grantPermission(aswin,readOnly);
		f2.grantPermission(aswin,readOnly);

		folder.grantPermission(prathi,all);
		f3.revokePermission(prathi,readOnly);

		f1.printPermissions("\n");
		folder.printPermissions("\n");

		System.out.println(f2.hasPermission(aswin,PermissionType.READ));
		System.out.println(f2.hasPermission(aswin,PermissionType.WRITE));

	}

}
