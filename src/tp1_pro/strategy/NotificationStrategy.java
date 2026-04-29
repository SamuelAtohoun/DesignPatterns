package tp1_pro.strategy;

import tp1_pro.User;

public interface NotificationStrategy {
	//void executeStrategy(Notification notification);
	
	void send(User user, String message);
	
}