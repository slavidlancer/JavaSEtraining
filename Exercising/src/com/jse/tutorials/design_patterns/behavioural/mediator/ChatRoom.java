package com.jse.tutorials.design_patterns.behavioural.mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println("[" + new Date().toString() + "] " + user.getName() +
                ": " + message);
    }
}
