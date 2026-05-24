package state;

import general.Abonnement;
import general.Notification;

public class EtatNotificationEnvoyee extends EtatNotification {

	public EtatNotificationEnvoyee(Notification notification) {
		super(notification);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operationEnvoi(Abonnement ab, String message) {
		// TODO Auto-generated method stub
		System.out.println("Impossible d'effectuer l'opération. Message déjà dans l'état envoyé");
	}

	@Override
	public void oprationRessayerEnvoi(Abonnement ab, String message) {
		// TODO Auto-generated method stub
		System.out.println("Impossible d'effectuer l'opération. Message déjà dans l'état envoyé");
	}

	@Override
	public void operationLecture(Abonnement ab, String message) {
		// TODO Auto-generated method stub
		System.out.println("Passage à l'état Lu.");
		notificationAvecEtat.setEtat(new EtatNotificationLue(notificationAvecEtat));
	}
	

}
