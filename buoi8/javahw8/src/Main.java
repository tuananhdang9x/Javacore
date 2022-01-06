public class Main {
    public static void main(String[] args) {
        Kitchen[] employeeKitchen = EmployeeService.createKitchen();
        EmployeeService.print(employeeKitchen);

        Waiter[] employeeWaiter = EmployeeService.createWaiter();
        EmployeeService.print(employeeWaiter);
    }
}