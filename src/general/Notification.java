package general;

import decorator.InterfaceNotification;
import state.EtatNotification;
import state.EtatNotificationAttente;
import strategy.NotificationStrategy;

public abstract class Notification implements InterfaceNotification {
	// abstract void send(User user);
	protected NotificationStrategy strategy;
	protected String message;

	private EtatNotification etatNotification;

	public Notification() {
		etatNotification = new EtatNotificationAttente(this);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStrategy(NotificationStrategy notifStrategy) {
		this.strategy = notifStrategy;
	}

	public NotificationStrategy getStrategy() {
		return strategy;
	}

	public EtatNotification getEtat() {
		return etatNotification;
	}

	public void setEtat(EtatNotification etatNotification) {
		this.etatNotification = etatNotification;
	}

	@Override
	public void send(Abonnement ab) {
		strategy.send(ab.getUser(), message);
	}

	// Disponible Sur notificationAttente
	public void operationEnvoi(Abonnement ab) {
		etatNotification.operationEnvoi(ab, message);
	}

	// Disponible Sur notificationEchouee
	public void oprationRessayerEnvoi(Abonnement ab) {
		etatNotification.oprationRessayerEnvoi(ab, message);
	}

	// Disponible Sur notificationEnvoyee
	public void operationLecture(Abonnement ab) {
		etatNotification.operationLecture(ab, message);
	}
}
