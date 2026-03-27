package tp1_pro;

import java.util.ArrayList;
import java.util.List;

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

	public void sendNotification(User user, String message) {
		for (Abonnement ab : abonnements) {
			if (ab.isSameUser(user)) {
				Notification notif = NotificationFactory.getNotification(ab.getType());
				notif.notifier();
			}
		}
	}

	public static NotificationManager getInstance() {
		if (notificationManager == null) {
			notificationManager = new NotificationManager();
		}

		return notificationManager;
	}
}
