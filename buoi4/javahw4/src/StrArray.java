import java.util.Scanner;

public class StrArray {

    // Nhập thông tin các phần tử
    public static String[] inputStrArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai mang:");
        int n = sc.nextInt();
        String[] strArr = new String[n];
        sc.nextLine();

        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("Phan tu %d la:", i);

            strArr[i] = sc.nextLine();
        }
        return strArr;
    }

    // In thông tin ra màn hình
    public static void printStrArr(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + "\t");
        }
        System.out.println();
    }

    // Đếm số phần tử "Java" xuất hiện trong mảng
    public static int countJava(String[] strArr) {
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase("Java")) {
                count++;
            }
        }
        return count;
    }

    // Kiểm tra vị trí chuỗi
    public static int positionStrArray(String[] strArr) {
        Scanner sc = new Scanner(System.in);
        String keyWord;
        int position = 0;
        System.out.println("Nhap chuoi bat ky:");
        String n = sc.nextLine();
        keyWord = n;
        for (int i = 0; i < strArr.length; i++) {
            if (keyWord.equalsIgnoreCase(strArr[i])) {
                position = i;
            }
        }
        return position;
    }
}
