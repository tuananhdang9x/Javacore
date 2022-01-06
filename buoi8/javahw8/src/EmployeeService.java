public class EmployeeService {

    public static Kitchen[] createKitchen() {

        Kitchen mr1 = new Kitchen(1, "Nam", 25, 9000000, 2000000);
        Kitchen mr2 = new Kitchen(2, "Son", 18, 7000000, 2000000);
        Kitchen mr3 = new Kitchen(3, "Duy", 19, 7000000, 2000000);

        Kitchen[] kitchenStaff = new Kitchen[3];
        kitchenStaff[0] = mr1;
        kitchenStaff[1] = mr2;
        kitchenStaff[2] = mr3;

        return kitchenStaff;
    }

    public static void print(Kitchen[] kitchenStaff) {
        for (Kitchen p : kitchenStaff) {
            System.out.println(p);
        }
    }

    public static Waiter[] createWaiter() {

        Waiter ms4 = new Waiter(4, "Linh", 22, 8000000, 1500000);
        Waiter ms5 = new Waiter(5, "Trang", 26, 8000000, 1500000);

        Waiter[] waiterStaff = new Waiter[2];
        waiterStaff[0] = ms4;
        waiterStaff[1] = ms5;

        return waiterStaff;
    }

    public static void print(Waiter[] waiterStaff) {
        for (Waiter q : waiterStaff) {
            System.out.println(q);
        }
    }

}
