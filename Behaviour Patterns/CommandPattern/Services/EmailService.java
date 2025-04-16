package CommandPattern.Services;

import java.util.Random;

import CommandPattern.models.Email;

public class EmailService
{
	public void sendMail(Email email) {
		// sending mail logic and sending unique mail identifier
		int uid = new Random().nextInt(2000);
		email.setMaildUID(uid);

	}

	public boolean undoMail(Email email) {
		// undo mail sent using mailUID
		return true;
	}


}
