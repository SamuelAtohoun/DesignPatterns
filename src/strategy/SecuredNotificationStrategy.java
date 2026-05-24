package strategy;

import general.User;

public class SecuredNotificationStrategy implements NotificationStrategy {
	private String CleChiffrement;
	@Override
	public void send(User user, String message) {
		// TODO Auto-generated method stub
		System.out.println("Envoi Sécurisé avec clé de chiffrement");
		System.out.println("Message a :" +user.getNom());
		System.out.println("Contenu du message :" + message);
	}
}
