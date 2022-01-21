package controller;

import model.Gender;
import model.User;
import service.UserService;
import util.Menu;
import util.Validate;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    static UserService service = new UserService();
    static ArrayList<User> users = service.getAllUser();


    public static void mainMenu(){
        boolean isContinue=true;
        while (isContinue){
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.show(users);
                    break;
                case 2:
                    showMale(users);
                    break;
                case 3:
                    addUser(users);
                    break;
                case 4:
                    searchByID(users);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
            }
        }
    }

    public static void showMale(ArrayList<User> users){
        for (User p:users){
            if(p.getGender()== Gender.MALE){
                System.out.println(p);
            }
        }
    }

    public static ArrayList<User> addUser(ArrayList<User> newUser) {
        boolean isContinue = true;
        while (isContinue){
            if(validateID() == null){
                isContinue=true;
            } else {
                isContinue=false;
            }
        }
        System.out.println("Nhập tên khách hàng:");
        String inputName = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        LocalDate inputDate = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập giới tính khách hàng");
        System.out.println("1 - Nữ");
        System.out.println("2 - Nam");
        int isCheck = Integer.parseInt(sc.nextLine());
        Gender gender = Gender.FEMALE;
        switch (isCheck) {
            case 1:
                gender = Gender.valueOf(String.valueOf(Gender.FEMALE));
                break;
            case 2:
                gender = Gender.valueOf(String.valueOf(Gender.MALE));
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        System.out.println("Nhập quê quán:");
        String inputHometown = sc.nextLine();

        while (isContinue){
            if(validatePhoneNumber() != null){
                isContinue=false;
            }
        }
        while (isContinue){
            if(validateEmail() != null){
                isContinue=false;
            }
        }

        newUser.add(new User(validateID(), inputName, inputDate, gender, inputHometown, validatePhoneNumber(), validateEmail()));
        return newUser;
    }

    public static ArrayList<User> searchByID(ArrayList<User> newUsers) {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Nhập mã khách hàng bạn muốn tìm:");
            String inputID = sc.nextLine();
            for (int i = 0; i < newUsers.size(); i++) {
                if (newUsers.get(i).getId().equals(inputID)) {
                    isContinue=false;
                    System.out.println(newUsers.get(i));
                    Menu.subMenu();
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Tên khách hàng cũ:");
                            System.out.println(newUsers.get(i).getName());
                            System.out.println("Sửa tên khách hàng:");
                            String setName = sc.nextLine();
                            newUsers.get(i).setName(setName);
                            System.out.println("Sửa ngày sinh");
                            LocalDate setDate = LocalDate.parse(sc.nextLine());
                            newUsers.get(i).setBirthday(setDate);

                            System.out.println("Sửa giới tính");
                            System.out.println("Nhập giới tính khách hàng");
                            System.out.println("1 - Nữ");
                            System.out.println("2 - Nam");
                            int isCheck = Integer.parseInt(sc.nextLine());
                            Gender gender = Gender.FEMALE;
                            switch (isCheck) {
                                case 1:
                                    gender = Gender.valueOf(String.valueOf(Gender.FEMALE));
                                    break;
                                case 2:
                                    gender = Gender.valueOf(String.valueOf(Gender.MALE));
                                    break;
                                default:
                                    System.out.println("Không có lựa chọn này");
                            }
                            System.out.println("Sửa quê quán");
                            String setHometown = sc.nextLine();
                            newUsers.get(i).setName(setHometown);

                            System.out.println("Số điện thoại cũ");
                            System.out.println(newUsers.get(i).getPhoneNumber());
                            System.out.println("Sửa số điện thoại:");
                            String setPhone = sc.nextLine();
                            newUsers.get(i).setPhoneNumber(setPhone);
                            System.out.println("Email cũ:");
                            System.out.println(users.get(i).getEmail());
                            System.out.println("Sửa email:");
                            String setEmail = sc.nextLine();
                            users.get(i).setEmail(setEmail);
                            newUsers.add(new User(validateID(),setName,setDate,gender,setHometown,setPhone,setEmail));
                        case 2:
                            users.remove(i);
                            break;
                        case 3:
                            mainMenu();
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");
                    }
                } else {
                    System.out.println("Không có khách hàng này!");
                }
            }
        }
        return newUsers;
    }

    public static String validatePhoneNumber() {

            String newPhonenumber;
            System.out.println("Nhập số điện thoại:");
            newPhonenumber = sc.nextLine();
            if (Validate.validatePhoneNumber(newPhonenumber)) {
                return newPhonenumber;
            } else {
                System.out.println("Số điện thoại gồm 10-11 số, xin nhập lại:");
                return null;
            }
    }

    public static String validateEmail(){

        String inputEmail;
            System.out.println("Nhập Email:");
            inputEmail = sc.nextLine();
            if (Validate.validateEmail(inputEmail)) {
                return inputEmail;
            } else {
                System.out.println("Email không hợp lệ, xin nhập lại:");
                return null;
            }
    }

    public static String validateID(){
            String inputID;
            System.out.println("Nhập mã khách hàng:");
            inputID = sc.nextLine();
            if (Validate.validateID(inputID)) {
                return inputID;
            } else {
                System.out.println("Mã khách hàng gồm 9 ký tự bắt đầu bằng KH, xin nhập lại:");
                return null;
            }
    }
}