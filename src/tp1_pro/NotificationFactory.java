package tp1_pro;

public class NotificationFactory {
	public static Notification getNotification(String type) {
		switch (type) {
		case "email":
			return new NotificationEmail();
		case "sms":
			return new NotificationSMS();
		case "push":
			return new NotificationPush();
		default:
			throw new IllegalArgumentException("Type de notification non pris en charge " + type);
		}
	}
}
