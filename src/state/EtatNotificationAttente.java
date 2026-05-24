package state;

import factory.NotificationFactory;
import general.Abonnement;
import general.Notification;
import general.User;

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
