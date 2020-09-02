package com.sevaslk.javacore.patterns.mediator;

interface User {
    void sendMessage(String message);

    void getMessage(String message);
}

class Admin implements User {
    private Chat chat;

    Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin getting message ' " + message + " '");
    }
}

class SimpleUser implements User {
    private Chat chat;

    SimpleUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User getting message ' " + message + " '");
    }
}