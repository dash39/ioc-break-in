package my.dash39.ioc._2_magic;

import my.dash39.ioc._0_common.NotificationService;

public class AuthListener {
    private NotificationService notificationService;

    public void onPasswordChanged(String newPassword) {
        notificationService.sendMessage("Password has changed!");
    }

    public void onUserLoggedIn() {
        notificationService.sendMessage("You have logged in!");
    }
}
