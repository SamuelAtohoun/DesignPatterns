package tp1_pro.state;

import tp1_pro.Abonnement;
import tp1_pro.Notification;
import tp1_pro.User;

public abstract class EtatNotification {
	protected Notification notificationAvecEtat;

	public EtatNotification(Notification notification) {
		this.notificationAvecEtat = notification;
	}
	
	public void setNotification(Notification notification)
	{
		this.notificationAvecEtat = notification;
	}
	
	//Passage d'une notificatin en Attente vers un état Envoyé
	public abstract void operationEnvoi(Abonnement ab, String message);
	
	//Passage d'une nitification échouée vers un état Envoyé
	public abstract void oprationRessayerEnvoi(Abonnement ab, String message);
	
	// Passage d'une notitification Envoyé vers l'état Lu
	public abstract void operationLecture(Abonnement ab, String message);
	
	
}
