package tp1_pro.strategy;

import tp1_pro.User;

public class FastNotificationStrategy implements NotificationStrategy {


	@Override
	public void send(User user, String message) {
		// TODO Auto-generated method stub
		System.out.println("Envoi rapide");
		System.out.println("Message à "+ user.getNom());
		System.out.println("Contenu du message :"+message);
	}

}
