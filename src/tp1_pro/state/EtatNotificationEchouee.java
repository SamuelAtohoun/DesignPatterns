package tp1_pro.state;

import tp1_pro.Abonnement;
import tp1_pro.Notification;

public class EtatNotificationEchouee extends EtatNotification {

	public EtatNotificationEchouee(Notification notification) {
		super(notification);
	}

	@Override
	public void operationEnvoi(Abonnement ab, String message) {
		// Appel à la méthode oprationRessayerEnvoi car notification échouée
		oprationRessayerEnvoi(ab, message);
	}

	@Override
	public void oprationRessayerEnvoi(Abonnement ab, String message) {
		System.out.println("Passage à l'état Envoyé");
		notificationAvecEtat.setEtat(new EtatNotificationEnvoyee(notificationAvecEtat));
	}

	@Override
	public void operationLecture(Abonnement ab, String message) {
		System.out.println("Impossible d'effectuer une lecture. Notification toujours en attente d'envoi");
	}
	
	
}
