package my.dash39.ioc._1_vanilla;

import my.dash39.ioc._0_common.EmailNotificationService;

public class AuthListener {
    private EmailNotificationService emailNotificationService = new EmailNotificationService();

    public void onPasswordChanged(String newPassword) {
        emailNotificationService.sendMessage("Password has changed!");
    }

    public void onUserLoggedIn() {
        emailNotificationService.sendMessage("You have logged in!");
    }
}
