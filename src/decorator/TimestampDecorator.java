package decorator;

import factory.NotificationFactory;
import general.Abonnement;
import general.Notification;
import general.User;
import strategy.FastNotificationStrategy;

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