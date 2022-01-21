package service;

import model.Gender;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("KH1215487","Nhâm Hoàng Giang", LocalDate.of(1997,6,15), Gender.FEMALE,"Ninh Bình","0972601541","nhg97@gmail.com"));
        users.add(new User("KH2212364","Nguyễn Luông", LocalDate.of(1997,2,19), Gender.MALE,"Hà Nội","0941601541","luong97@gmail.com"));
        users.add(new User("KH9636325","Phạm Minh Hoàng", LocalDate.of(1997,7,12), Gender.MALE,"Hải Dương","0973661519","hoang97@gmail.com"));
        return users;
    }

    public void show(ArrayList<User> users){
        for (User p:users){
            System.out.println(p);
        }
    }

}
