package controller;

import model.TransactionService;
import model.User;
import service.Transaction;
import service.UserService;
import util.Menu;
import util.Validate;

import java.time.LocalDate;
import java.util.*;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    static UserService service = new UserService();
    static ArrayList<User> users = service.getAllUser();

    TransactionService transactionService = new TransactionService();
    ArrayList<Transaction> transactions = transactionService.getAllTransaction();

    public void home() {
        boolean isCheck = true;
        while (isCheck){
            Menu.mainMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    login();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }

    public void login() {
        boolean validateAccout = false;
        while (!validateAccout){
            for(User p:users){
                try {
                    System.out.println("Nhập số điện thoại:");
                    long phoneNumber = Long.parseLong(sc.nextLine());
                    System.out.println("Nhập mật khẩu:");
                    String password = sc.nextLine();
                    if(p.getPhoneNumber()== phoneNumber){
                        validateAccout = true;
                        if (p.getPassword().equals(password)){
                            loginSuccess();
                        } else {
                            validateAccout = false;
                        }
                    }
                } catch (NumberFormatException e){
                    System.out.println("Vui lòng nhập số!");
                    validateAccout = false;
                }
            }
            System.out.println("Bạn đã đăng nhập sai số điện thoại hoặc mật khẩu!");
        }

    }

    public void loginSuccess() {
        System.out.println("Bạn có thể thực hiện các công việc sau ngay trên ứng dụng VPBank Online:");
        Boolean isCheck = true;
        while (isCheck){
            Menu.menuSuccessLogin();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    checkMoney();
                    break;
                case 2:
                    addTransaction(transactions);
                    break;
                case 3:
                    System.out.println("Lịch sử giao dịch:");
                    historyTransaction(transactions);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void checkMoney(){
        System.out.println("Số dư trong tài khoản của bạn là:");
        for (User p:users){
            System.out.println(p.getRestMoney());
        }
    }

    public static ArrayList<Transaction> addTransaction(ArrayList<Transaction> newTransactions) {
        Scanner sc = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Ngân hàng bạn muốn chuyển tiền đến là:");
            String bankName = sc.nextLine();
            long accountNumber = inputAccount();
            long transferMoney = inputTranserMoney();
            System.out.println("Nhập mô tả:");
            String description = sc.nextLine();
            int id = random.nextInt(10);
            LocalDate dateTransfer = LocalDate.now();
            System.out.println("Bạn đã chuyển tiền thành công!");
            newTransactions.add(new Transaction(id,dateTransfer,bankName,accountNumber,transferMoney,description));
        return newTransactions;
    }

    public static void  historyTransaction(ArrayList<Transaction> newTransactions){
        for (Transaction p:newTransactions){
            System.out.println(p);
        }
    }

    public static long inputAccount() {
        boolean isValidAccout = false;
        long accountNumber = 0;
        while (!isValidAccout) {
            try {
                System.out.println("Nhập số tài khoản:");
                accountNumber = Long.parseLong(sc.nextLine());
                if (!Validate.validateAccount(String.valueOf(accountNumber))) {
                    System.out.println("Tài khoản không hợp lệ (gồm 8-16 số), xin vui lòng nhập lại:");
                } else {
                    isValidAccout = true;
                }
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!");
            }
        }
        return accountNumber;
    }

    public static long inputTranserMoney(){
        boolean isValidTransfer = false;
        long transferMoney =0;
        while (!isValidTransfer){
            try {
                System.out.println("Nhập số tiền bạn muốn chuyển:");
                transferMoney = Long.parseLong(sc.nextLine());
                for (User p: users){
                    if(transferMoney<50000){
                        System.out.println("Số tiền chuyển đi tối thiểu là:50.000 VNĐ");
                        System.out.println("Xin vui lòng nhập lại:");
                    } else {
                        if (transferMoney>p.getRestMoney()-50000){
                            System.out.println("Số dư tài khoản không đủ để thực hiện giao dịch");
                            System.out.println("Xin vui lòng nhập lại:");
                        } else {
                            System.out.println("Số tiền chuyển đi là:" + transferMoney);
                            isValidTransfer = true;
                        }
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!");
            }
        }
        return transferMoney;
    }
}
