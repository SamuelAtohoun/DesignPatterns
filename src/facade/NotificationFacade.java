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

	public Notification envoyer(Abonnement ab, String message, NotificationStrategy ns, Notification notification) {
		notification = NotificationFactory.getNotification(ab.getTypeNotification());
		notification.setMessage(message);
		notification.setStrategy(ns);
		notificationManager.notifier(ab, notification);
		return notification;
	}

	public void lireNotification(Notification notification, Abonnement ab) {
		notification.operationLecture(ab);
	}

}
