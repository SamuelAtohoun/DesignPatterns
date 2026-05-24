package state;

import general.Abonnement;
import general.Notification;

public class EtatNotificationLue extends EtatNotification {

	public EtatNotificationLue(Notification notification) {
		super(notification);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operationEnvoi(Abonnement ab, String message) {
		// TODO Auto-generated method stub
		System.out.println("Opération impossible. Etat actuel: Lu");
	}

	@Override
	public void oprationRessayerEnvoi(Abonnement ab, String message) {
		// TODO Auto-generated method stub
		System.out.println("Opération impossible. Etat actuel: Lu");
	}

	@Override
	public void operationLecture(Abonnement ab, String message) {
		System.out.println("Notification déjà dans l'état lu");
	}
	
	
}
