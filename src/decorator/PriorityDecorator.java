package decorator;

import general.Abonnement;

public class PriorityDecorator extends NotificationDecorateurAbtraite{
	@Override
	public void send(Abonnement ab) {
		// TODO Auto-generated method stub
		System.out.println("Envoi avec priorité");
		notification.send(ab);
	}
	
	  public PriorityDecorator(InterfaceNotification notification) {
	        super(notification);
	    }
}
