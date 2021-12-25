import java.util.Scanner;

public class Cau6 {

    public static int[][] inputIntArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang:");
        int row = sc.nextInt();

        System.out.println("Nhap so cot:");
        int col = sc.nextInt();

        int[][] intArray = new int[row][col];
        // sc.nextLine();

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                System.out.printf("Gia tri hang %d, cot %d la:", i, j);
                intArray[i][j] = sc.nextInt();
            }
        }
        return intArray;
    }

    public static void printIntArray(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ktDuongCheo(int[][] intArray) {
        System.out.println("Duong cheo chinh la:");
        if (intArray.length == intArray[0].length) {
            for (int i = 0; i < intArray.length; i++) {

                System.out.print(intArray[i][i] + " ");
            }
            System.out.println();
        }

    }

}
