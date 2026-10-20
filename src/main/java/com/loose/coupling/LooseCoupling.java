package com.loose.coupling;

public class LooseCoupling {


    public static void main(String[] args){
        UserDataProvider dataProvider  = new UserdataLoose()  ;
        UserManagerCoupling UserManager = new UserManagerCoupling(dataProvider) ;
        System.out.println(UserManager.getUserInfo());
        System.out.println();
        System.out.println();

        webService webServiceProvider = new webService() ;
        UserManagerCoupling userManager = new UserManagerCoupling(webServiceProvider) ;
        System.out.println(userManager.getUserInfo());
    }

}
