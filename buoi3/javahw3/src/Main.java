import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Bai 1:

        String s = "You only live once, but if you do it right, once is enough";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
                System.out.println("Vi tri ky tu o la:" + i);
            }
        }
        System.out.println("So ky tu o la:" + count);

        // Bai 2:

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so a:");
        double a = sc.nextDouble();

        System.out.println("Nhap vao so b:");
        double b = sc.nextDouble();

        if (a != 0) {
            System.out.println("Phuong trinh co nhiem la:" + -b / a);
        } else {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nhiem");

            } else {
                System.out.println("Phuong trinh vo nhiem");
            }
        }
    }

}
