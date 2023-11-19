package data;

import entity.User;

import java.util.ArrayList;

public class Data {

    private static ArrayList<User> users = new ArrayList<>();

    public static void init(){
        users.add(new User("杨芋棚" ,"12345","雅安市"));
        users.add(new User("张三","33333","成都市"));
        users.add(new User("李四","44444","成都市"));
    }


    public static ArrayList<User> getAllUser(){
        return users;
    }

    public static void deleteUserByName(String name){
        for (User user:users){
            if(user.getName().equals(name)){
                users.remove(user);
                break;
            }
        }
    }

    public static void addUser(User user){
        users.add(user);
    }
}
