package my.dash39.ioc._0_common;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendMessage(String msg) {
        System.out.printf("Sending email: `%s`\n", msg);
    }
}
