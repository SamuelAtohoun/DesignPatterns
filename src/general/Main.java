package general;

import decorator.PriorityDecorator;
import decorator.ReceiptDecorator;
import facade.NotificationFacade;
import factory.NotificationFactory;
import strategy.FastNotificationStrategy;
import strategy.NotificationStrategy;
import strategy.ScheduledNotificationStrategy;
import strategy.SecuredNotificationStrategy;

public class Main {

	public static void main(String[] args) {

		// -----Utilisation de Facade ---------
		NotificationFacade notificationFacade = new NotificationFacade();

		User georges = new User("Georges Washington", 23);
		ScheduledNotificationStrategy strategy = new ScheduledNotificationStrategy();
		String message = "Bonjour Georges. Je t'écris pour te tenir informé de la réunion de fin de projet";

		Notification notification = null;
		Abonnement ab = new Abonnement(georges, "push");

		notification = notificationFacade.envoyer(ab, message, strategy, notification);
		notificationFacade.lireNotification(notification, ab);
	}

}
