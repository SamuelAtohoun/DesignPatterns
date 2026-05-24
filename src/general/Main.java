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
		String message = "Hello User";

		notificationFacade.envoyer(new Abonnement(georges, "push"), message, strategy);

		/*
		 * User user1 = new User("Alice", 25); Abonnement ab1 = new Abonnement(user1,
		 * "email");
		 * 
		 * Notification notifBase = NotificationFactory.getNotification("email");
		 * notifBase.setMessage("Bonjour Alice !"); notifBase.setStrategy(new
		 * FastNotificationStrategy());
		 * 
		 * // Sans décorateur System.out.println("=== Sans décorateur ===");
		 * notifBase.send(ab1);
		 * 
		 * // Avec priorité System.out.println("\n=== Avec PriorityDecorator ===");
		 * PriorityDecorator priorityNotif = new PriorityDecorator(notifBase);
		 * priorityNotif.send(ab1);
		 * 
		 * // Avec accusé de réception
		 * System.out.println("\n=== Avec ReceiptDecorator ==="); ReceiptDecorator
		 * receiptNotif = new ReceiptDecorator(notifBase); receiptNotif.send(ab1);
		 */
	}

}
