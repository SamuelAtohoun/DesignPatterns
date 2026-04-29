package tp1_pro;

import decorator.PriorityDecorator;
import decorator.ReceiptDecorator;
import tp1_pro.strategy.FastNotificationStrategy;
import tp1_pro.strategy.NotificationStrategy;
import tp1_pro.strategy.SecuredNotificationStrategy;

public class Main {

	
	 public static void main(String[] args) {

	        User user1 = new User("Alice", 25);
	        Abonnement ab1 = new Abonnement(user1, "email");

	        Notification notifBase = NotificationFactory.getNotification("email");
	        notifBase.setMessage("Bonjour Alice !");
	        notifBase.setStrategy(new FastNotificationStrategy());

	        // Sans décorateur
	        System.out.println("=== Sans décorateur ===");
	        notifBase.send(ab1);

	        // Avec priorité
	        System.out.println("\n=== Avec PriorityDecorator ===");
	        PriorityDecorator priorityNotif = new PriorityDecorator(notifBase);
	        priorityNotif.send(ab1);

	        // Avec accusé de réception
	        System.out.println("\n=== Avec ReceiptDecorator ===");
	        ReceiptDecorator receiptNotif = new ReceiptDecorator(notifBase);
	        receiptNotif.send(ab1);

	        // Les deux ensemble
	        System.out.println("\n=== Priority + Receipt ===");
	        ReceiptDecorator stacked = new ReceiptDecorator(new PriorityDecorator(notifBase));
	        stacked.send(ab1);
	    }

}
