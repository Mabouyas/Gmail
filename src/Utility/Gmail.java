package Utility;

import org.apache.commons.mail.SimpleEmail;

public class Gmail {
	
		public static void sendEmails (String username, String password, String Receiver, String Subject, String MSG){
			SimpleEmail email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthentication(username, password);
			email.setSSLOnConnect(true);
			email.setSubject(Subject);
			try {
				email.setFrom(username);
				email.setMsg(MSG);
				email.addTo(Receiver);
				email.send();
				Thread.sleep(1500);
			} catch (Exception e) {
			}
			
		}
	}
