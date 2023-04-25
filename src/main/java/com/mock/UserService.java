package com.mock;

public class UserService {
    public boolean isUserActive(String id){
       if ((id.startsWith("A"))){
           return true;
       }else {
           return false;
       }
    }
}
