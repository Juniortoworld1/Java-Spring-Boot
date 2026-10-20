package com.tight.copling;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {

        return userDatabase.getDatabase();
    }
}