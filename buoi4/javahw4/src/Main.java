import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        // Nhập thông tin các phần tử
        String[] strArr = StrArray.inputStrArr();

        // In thông tin ra màn hình
        StrArray.printStrArr(strArr);

        // Đếm số phần tử "Java" xuất hiện trong mảng
        int countJava = StrArray.countJava(strArr);
        System.out.println("So phan tu Java xuat hien la:" + countJava);

        // Kiểm tra vị trí chuỗi
        int viTri = StrArray.positionStrArray(strArr);
        System.out.println("Vi tri cua chuoi do la:" + viTri);
    }
}