package com.sevaslk.javacore.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

interface Chat {
    void sendMessage(String message, User user);
}

class TextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    void setAdmin(User admin) {
        this.admin = admin;
    }


    void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}