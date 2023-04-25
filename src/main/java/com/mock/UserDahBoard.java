package com.mock;

public class UserDahBoard {
    private static class MockUserService extends UserService{
        @Override
        public boolean isUserActive(String id) {
           if(id.equals("Alice")){
               return true;
           }else {
               return false;
           }
        }
    }
    //@Test
    public void testDisplayName(){
        UserService mockUser = new MockUserService();
        UserDashBoard userDashBoard = new UserDashBoard(mockUser);
        String result = userDashBoard.displayName("Alice");
        String result1 = userDashBoard.displayName("Bob");

    }
}
