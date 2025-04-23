package proxypattern;

import java.time.LocalTime;

public class AccessLogger
{

	public void log(User user, LocalTime time,File file) {

		System.out.println(user.toString() + time.toString() + file.toString());

	}

}
