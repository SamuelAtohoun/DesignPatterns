package facade;

import decorator.PriorityDecorator;
import factory.NotificationFactory;
import general.Abonnement;
import general.Notification;
import general.NotificationManager;
import strategy.NotificationStrategy;
import strategy.ScheduledNotificationStrategy;

public class NotificationFacade {
	private NotificationManager notificationManager = NotificationManager.getInstance();

	public NotificationFacade() {

	}

	public void envoyer(Abonnement ab, String message, NotificationStrategy ns) {
		notificationManager.notifier(ab, message, ns);
	}

}
