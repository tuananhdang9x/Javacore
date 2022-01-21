import java.util.Scanner;

public class Controller {

    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        boolean isContinue = true;
        while (isContinue){
            System.out.println("Nhập vào số bạn muốn kiểm tra:");
            if(isContinue=isPrimeNumber()){
                System.out.println("Đây là số nguyên tố!");
            } else {
                System.out.println("Đây không phải là số nguyên tố!");
            }
            System.out.println("Q - Thoát chương trình");
            System.out.println("C - Tiếp tục");
            String inputQ = sc.nextLine();
            if(inputQ.equalsIgnoreCase("q")){
                System.exit(0);
            } else if(inputQ.equalsIgnoreCase("c")){
                isContinue=true;
            }
        }
    }

    public static boolean isPrimeNumber(){
        int n = Integer.parseInt(sc.nextLine());
        if (n<2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i=2; i<=squareRoot; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
