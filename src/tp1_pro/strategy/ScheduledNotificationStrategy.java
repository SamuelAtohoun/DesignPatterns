package tp1_pro.strategy;

import tp1_pro.User;

public class ScheduledNotificationStrategy implements NotificationStrategy {

	private int heure;

	@Override
	public void send(User user, String message) {
		// if (heure > 0) {
		System.out.println("Envoi Programmé à " + heure);
		System.out.println("Message à "+ user.getNom());
		System.out.println("Contenu du message :" + message);
		// }
	}

}
