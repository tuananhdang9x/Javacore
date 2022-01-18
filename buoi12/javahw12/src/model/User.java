package model;

public class User {
    private long phoneNumber;
    private String password;
    private long restMoney;

    public User(long phoneNumber, String password, long restMoney) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.restMoney = restMoney;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRestMoney() {
        return restMoney;
    }

    public void setRestMoney(long restMoney) {
        this.restMoney = restMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber=" + phoneNumber +
                ", password='" + password + '\'' +
                ", restMoney=" + restMoney +
                '}';
    }
}
