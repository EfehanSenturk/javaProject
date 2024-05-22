package Message;

public class HtmlNotification extends Notification {
    public HtmlNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void notify(String message) {
        messageSender.sendMessage("HTML Notification: " + message);
    }
}
