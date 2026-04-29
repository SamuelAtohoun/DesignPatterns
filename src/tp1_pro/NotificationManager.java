package tp1_pro;

import java.util.ArrayList;
import java.util.List;

import tp1_pro.strategy.NotificationStrategy;

public class NotificationManager {
	private static NotificationManager notificationManager;
	private List<Abonnement> abonnements = new ArrayList<Abonnement>();

	private NotificationManager() {

	}

	public void addAbonnements(ArrayList<Abonnement> abonnements) {
		for (Abonnement ab : abonnements) {
			if (!abonnements.contains(ab)) {
				abonnements.add(ab);
			}
		}
	}

	public void addAbonnement(Abonnement abonnement) {
		if (!abonnements.contains(abonnement))
			abonnements.add(abonnement);
	}

	public void notifierAll(String message, NotificationStrategy ns) {
		for(Abonnement ab : abonnements)
		{
			Notification notification = NotificationFactory.getNotification(ab.getTypeNotification());
			notification.setMessage(message);
			notification.setStrategy(ns);
			notification.send(ab);
		}
	}
	
	public void notifier(Abonnement ab, String message, NotificationStrategy ns) {
		Notification notification = NotificationFactory.getNotification(ab.getTypeNotification());
		notification.setMessage(message);
		notification.setStrategy(ns);
		notification.send(ab);
	}

	public static NotificationManager getInstance() {
		if (notificationManager == null) {
			notificationManager = new NotificationManager();
		}

		return notificationManager;
	}
}
