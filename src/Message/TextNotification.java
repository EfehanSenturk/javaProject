package Message;

public class TextNotification extends Notification {
    public TextNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void notify(String message) {
        messageSender.sendMessage("Text Notification: " + message);
    }
}