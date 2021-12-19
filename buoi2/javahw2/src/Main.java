import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bài 1:

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao chuoi 1:");
        String firstString = sc.nextLine();

        System.out.println("Chuoi 1 la:" + firstString);

        System.out.println("Nhap vao chuoi 2:");
        String secondString = sc.nextLine();

        System.out.println("Chuoi 2 la:" + secondString);

        // Kiểm tra hai chuỗi có bằng nhau hay không.

        String test = firstString.equals(secondString) ? "Hai chuoi bang nhau" : "Hai chuoi khong bang nhau";
        System.out.println(test);

        // Kiểm tra kích thước hai chuỗi có bằng nhau không.

        int lengthFirstStr = firstString.length();
        int lengthSecondStr = secondString.length();

        String test2 = lengthFirstStr == lengthSecondStr ? "Kich thuoc bang nhau" : "Kich thuoc khong bang nhau";
        System.out.println(test2);

        // Bài 2:

        System.out.println("Nhap diem thuc hanh:");
        double diemThucHanh = sc.nextDouble();
        System.out.println("Diem thuc hanh cua ban la:" + diemThucHanh);

        System.out.println("Nhap diem ly thuyet:");
        double diemLyThuyet = sc.nextDouble();
        System.out.println("Diem ly thuyet cua ban la:" + diemLyThuyet);

        double diemTrungBinh = (diemLyThuyet + diemThucHanh) / 2;

        System.out.println("Diem trung binh cua ban la:" + diemTrungBinh);

        String result = diemTrungBinh >= 6 ? "Hoc Vien Dat" : "Hoc Vien Truot";
        System.out.println(result);
    }
}