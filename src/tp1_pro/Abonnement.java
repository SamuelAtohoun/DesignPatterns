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
	
	public String getType()
	{
		return typeNotif;
	}
	

}
