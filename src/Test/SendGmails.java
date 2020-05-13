package Test;

import Utility.Gmail;

public class SendGmails {
	public static void main(String[] args) {
	String username = "";
	String password = "";
	String Receiver = "";
	String Subject = "";
	String MSG = "";
	
	Gmail.sendEmails(username, password, Receiver,Subject, MSG);
	}
}
