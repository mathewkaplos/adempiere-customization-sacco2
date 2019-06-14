package mat.mathew;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author MATT
 *
 */
public class SendMailSSL {
	private static String host = "";
	private static int port = 0;
	private static int socketPort = 0;
	private static boolean authenticate = false;
	private static String emailFrom = "";
	private static String password = "";
	private static String emailTo = "";
	private static String subject = "";
	private static String _message = "";

	/**
	 * @param host
	 * @param port
	 * @param socketPort
	 * @param authenticate
	 * @param emailFrom
	 * @param password
	 * @param emailTo
	 * @param subject
	 * @param _message
	 * 
	 */
	public SendMailSSL(String host, int port, int socketPort, boolean authenticate, String emailFrom, String password,
			String emailTo, String subject, String _message) {
		this.host = host;
		this.port = port;
		this.socketPort = socketPort;
		this.authenticate = authenticate;
		this.emailFrom = emailFrom;
		this.password = password;
		this.emailTo = emailTo;
		this.subject = subject;
		this._message = _message;

	}

	public  void send() {

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.socketFactory.port", String.valueOf(socketPort));
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", String.valueOf(authenticate));
		props.put("mail.smtp.port", String.valueOf(port));

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailFrom, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emailFrom));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo));
			message.setSubject(subject);
			message.setText(_message);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}
