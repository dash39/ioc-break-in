package my.dash39.ioc._3_di;

import my.dash39.ioc._0_common.NotificationService;

public class AuthListener {
    private NotificationService notificationService;

    public AuthListener(NotificationService notificationService1) {
        notificationService = notificationService1;
    }

    public void onPasswordChanged(String newPassword) {
        notificationService.sendMessage("Password has changed!");
    }

    public void onUserLoggedIn() {
        notificationService.sendMessage("You have logged in!");
    }
}



