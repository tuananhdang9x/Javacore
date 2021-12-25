public class Main {
    public static void main(String[] args) {
        // Cau 1:
        char[][] hinhVuong = Cau1.hinhVuong();
        Cau1.printHinhVuong(hinhVuong);

        char[][] hinhTamGiac = Cau1.hinhTamGiac();
        Cau1.printTamGiac(hinhTamGiac);

        // Cau 2:
        int countWord = Cau2.countArray();
        System.out.println(countWord);

        int countO = Cau2.countO();
        System.out.println(countO);

        // Cau 3:
        int rd = Cau3.rdNumber();
        System.out.println("So ngau nhien la:" + rd);
        boolean trueFalse = Cau3.isPrimeNumber(rd);
        System.out.println("Ket qua la:" + trueFalse);

        // Cau4:
        Cau4.soNguyenTo();
        Cau4.ktSoNguyenTo();

        // Cau 6:
        int[][] intArray = Cau6.inputIntArray();
        Cau6.printIntArray(intArray);
        Cau6.ktDuongCheo(intArray);

        // Cau 5:

        String hoTen = Cau5.inputName();
        System.out.println(hoTen);

    }
}
