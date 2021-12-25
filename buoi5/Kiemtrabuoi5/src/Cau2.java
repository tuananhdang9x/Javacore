public class Cau2 {
    public static int countArray() {
        String message = "You only live once, but if you do it right, once is enough";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countO() {
        String message = "You only live once, but if you do it right, once is enough";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }
}
