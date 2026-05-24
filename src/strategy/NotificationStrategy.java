package strategy;

import general.User;

public interface NotificationStrategy {
	//void executeStrategy(Notification notification);
	
	void send(User user, String message);
	
}