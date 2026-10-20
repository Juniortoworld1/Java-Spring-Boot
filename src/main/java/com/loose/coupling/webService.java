package com.loose.coupling;

public class webService implements UserDataProvider{
    @Override
    public String getData() {
        return "This is a part of webSerivceProvier";
    }
}
