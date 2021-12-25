public class Cau4 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void soNguyenTo() {
        int n = 0;
        int count = 0;
        System.out.println("10 so nguyen to dau la:");
        while (count < 10) {
            if (isPrimeNumber(n)) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }
    }

    public static void ktSoNguyenTo() {
        System.out.println("So nguyen to nho hon 10 la:");
        for (int n = 0; n < 10; n++) {
            if (isPrimeNumber(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
