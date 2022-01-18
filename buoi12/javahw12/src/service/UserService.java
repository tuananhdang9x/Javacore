package service;

import model.User;

import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(123,"123",5000000));
        return users;
    }
}
