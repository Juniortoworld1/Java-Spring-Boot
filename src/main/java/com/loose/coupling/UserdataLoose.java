package com.loose.coupling;

public class UserdataLoose implements UserDataProvider{
    @Override
    public String getData() {
        return "You data is already fetched";
    }
}
