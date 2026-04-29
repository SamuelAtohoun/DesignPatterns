package decorator;

import tp1_pro.Abonnement;
import tp1_pro.Notification;
import tp1_pro.NotificationFactory;
import tp1_pro.User;
import tp1_pro.strategy.FastNotificationStrategy;

public class TimestampDecorator extends NotificationDecorateurAbtraite {

	public TimestampDecorator(InterfaceNotification notification) {
		super(notification);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(Abonnement ab) {
		// TODO Auto-generated method stub
		System.out.println("Envoi avec horodatage");
		notification.send(ab);
		
	}

    
}