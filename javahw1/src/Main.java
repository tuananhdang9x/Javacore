public class Main {
    public static void main(String[] args) {

        System.out.println(Calculator.sum(18, 19));

        System.out.println(Calculator.subtract(30, 10));

        System.out.println(Calculator.multiply(3.42, 6.97));

        System.out.println(Calculator.divide(2.56f, 4.58f));

        // Tinh chi so BMI kieu tra ve void:
        bMI(65.5, 1.65);
        // Tinh chi so BMI kieu tra ve double co truyen tham so: -> Phuong thuc nay la
        // tot nhat!
        System.out.printf("\nChi so BMI cua ban la:%.2f", BmiCaculator.calBmits(65.5, 1.65));

        // Tinh chi so BMI kieu tra ve double:
        double canNang = 65.5;
        double chieuCao = 1.65;
        double bmi1 = canNang / (chieuCao * chieuCao);

        System.out.printf("\nChi so BMI cua ban la:%.2f", bmi1);
    }

    public static void bMI(double weight, double height) {
        System.out.printf("\nChi so BMI cua ban la:%.2f", weight / (height * height));
    }

}
