package model;

import java.time.LocalDate;

public class User {
    private String id;
    private String name;
    private LocalDate birthday;
    private Gender gender;
    private String hometown;
    private String phoneNumber;
    private String email;

    public User(String id, String name, LocalDate birthday, Gender gender, String hometown, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.hometown = hometown;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Mã khách hàng:"+id+" - "+"Tên:"+name+" - "+"Ngày sinh:"+birthday+" - "+"Giới tính:"+getGender()+" - "+"Quê quán:"+hometown+" - "+"Số điện thoại:"+phoneNumber+" - "+"Email:"+email;
    }
}
