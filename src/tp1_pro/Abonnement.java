package tp1_pro;

public class Abonnement {
	private User user;
	private String typeNotif;

	public Abonnement(User user, String typeNotif) {
		this.user = user;
		this.typeNotif = typeNotif;
	}

	public boolean isSameUser(User user) {
		return user.equals(this.user);
	}
	
	public String getTypeNotification()
	{
		return typeNotif;
	}
	
	public User getUser()
	{
		return user;
	}
	
	/*
	 * public void sendNotification(String message) { Notification notif =
	 * NotificationFactory.getNotification(typeNotif); notif.notifier(message); }
	 */
}
