import java.util.Scanner;

public class Cau5 {

    public static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        String name = sc.nextLine();

        char[] charArray = name.toCharArray();

        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (foundSpace) {
                if (Character.isLetter(charArray[i])) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }

        }
        name = String.valueOf(charArray);
        return name;
    }
}
