package com.behavioral_pattern.patterns.chain_of_responsibility.models;

public class RequestUser {
    private IUser user;

    public void setUser(IUser user) {
        this.user = user;
    }

    public void ImpMessage() {
        if (user != null) {
            user.userAccess();
        }

    }

    public Boolean isAdmin() {
        return user.getRange().equalsIgnoreCase("Admin");
    }

    public Boolean isMod() {
        return user.getRange().equalsIgnoreCase("Moderator");
    }

    public Boolean isUser() {
        return user.getRange().equalsIgnoreCase("User");
    }
}
