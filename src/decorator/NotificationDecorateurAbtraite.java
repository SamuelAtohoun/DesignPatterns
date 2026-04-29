package decorator;

public abstract class NotificationDecorateurAbtraite implements InterfaceNotification {
	protected InterfaceNotification notification;

	public NotificationDecorateurAbtraite(InterfaceNotification notification) {
		this.notification = notification;
	}
}
