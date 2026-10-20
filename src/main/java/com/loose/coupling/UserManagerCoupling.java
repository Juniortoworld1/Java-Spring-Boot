package com.loose.coupling;

public class UserManagerCoupling {
    private UserDataProvider userdataProvider ;
    public UserManagerCoupling(UserDataProvider udbs){
        this.userdataProvider = udbs ;
    }

    public  String getUserInfo(){
        return userdataProvider.getData() ; 
    }

}
