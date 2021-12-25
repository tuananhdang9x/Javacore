import java.util.Random;

public class Cau3 {

    public static int rdNumber() {
        Random rd = new Random();

        int n = rd.nextInt(10);
        return n;
    }

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

}
