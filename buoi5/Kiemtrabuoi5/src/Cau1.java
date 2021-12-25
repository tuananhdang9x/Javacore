public class Cau1 {
    public static char[][] hinhVuong() {
        char[][] hinhVuong = { { '*', '*', '*', '*' }, { '*', '*', '*', '*' }, { '*', '*', '*', '*' }, { '*', '*', '*',
                '*' } };
        return hinhVuong;

    }

    public static void printHinhVuong(char[][] hinhVuong) {
        for (int i = 0; i < hinhVuong.length; i++) {
            for (int j = 0; j < hinhVuong.length; j++) {
                System.out.print(hinhVuong[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] hinhTamGiac() {
        char[][] hinhTamGiac = { { '*', ' ', ' ', ' ' }, { '*', '*', ' ',
                ' ' }, { '*', '*', '*', ' ' }, { '*', '*', '*', '*' } };
        return hinhTamGiac;
    }

    public static void printTamGiac(char[][] hinhTamGiac) {
        for (int i = 0; i < hinhTamGiac.length; i++) {
            for (int j = 0; j < hinhTamGiac.length; j++) {
                System.out.print(hinhTamGiac[i][j] + " ");
            }
            System.out.println();
        }
    }

}
