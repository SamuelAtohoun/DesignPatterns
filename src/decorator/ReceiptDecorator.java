package decorator;

import tp1_pro.Abonnement;

public class ReceiptDecorator extends NotificationDecorateurAbtraite {

	@Override
	public void send(Abonnement ab) {
		// TODO Auto-generated method stub
		System.out.println("Envoi avec accusé de réception");
		notification.send(ab);
	}

	public ReceiptDecorator(InterfaceNotification notification) {
		super(notification);
	}
}
