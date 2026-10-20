package com.tight.copling;

public class tightCoplingExample {
    public static void main(String[] args){
        UserManager manager = new UserManager() ;
        System.out.println(manager.getUserInfo());
    }
}
