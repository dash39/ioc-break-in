package my.dash39.ioc._0_common;

public class PushNotificationService implements NotificationService {
    @Override
    public void sendMessage(String msg) {
        System.out.printf("Sending push notification: `%s`\n", msg);
    }
}
