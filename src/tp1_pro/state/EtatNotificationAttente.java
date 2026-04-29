package tp1_pro.state;

import tp1_pro.Abonnement;
import tp1_pro.Notification;
import tp1_pro.NotificationFactory;
import tp1_pro.User;

public class EtatNotificationAttente extends EtatNotification {
	
	public EtatNotificationAttente(Notification notification) {
		super(notification);
	}

	@Override
	public void operationEnvoi(Abonnement ab, String message) {
		System.out.println("Passage à l'état Envoyé");
		notificationAvecEtat.setEtat(new EtatNotificationEnvoyee(notificationAvecEtat));
		
	}

	@Override
	public void oprationRessayerEnvoi(Abonnement ab, String message) {
		// Même méthode car notification toujours en attente
		operationEnvoi(ab, message);
	}

	@Override
	public void operationLecture(Abonnement ab, String message) {
		System.out.println("Impossible de passer à l'état Lu. Notication non envoyée");
	}




}
