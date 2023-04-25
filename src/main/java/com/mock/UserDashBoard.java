package com.mock;

public class UserDashBoard {
    private UserService userService;
    public UserDashBoard(UserService userService) {
        this.userService = userService;
    }
    public String displayName(String id){
        if (userService.isUserActive(id)){
            return id + "is active";
        }else {
            return id + "is inactive";
        }
    }
}
