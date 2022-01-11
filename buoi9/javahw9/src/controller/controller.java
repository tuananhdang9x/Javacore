package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Store;

import service.StoreService;

public class controller {

    static Scanner sc = new Scanner(System.in);
    static StoreService service = new StoreService();
    static ArrayList<Store> stores = service.getAllStore();

    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("1 - Xem danh sach toan bo sap pham");
        System.out.println("2 - Tim san pham theo ten");
        System.out.println("3 - Them 1 san pham vao danh sach");
        System.out.println("4 - Thoat chuong trinh");
        System.out.println("Lua chon cua ban la:");

    }

    public static void submenu() {
        System.out.println("---------------------------");
        System.out.println("1 - Cap nhat ten san pham");
        System.out.println("2 - Cap nhat gia san pham");
        System.out.println("3 - Xoa 1 san pham");
        System.out.println("4 - Quay ve man hinh chinh");
        System.out.println("Lua chon cua ban la");
    }

    public static void mainMenu() {
        boolean isContinue = true;
        while (isContinue) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sach:");
                    service.show(stores);
                    break;
                case 2:
                    System.out.println("Nhap ten san pham ban muon tim");
                    String name = sc.nextLine();
                    service.searchByName(stores, name);
                    break;
                case 3:
                    System.out.println("Them san pham:");
                    Store newItem = service.createNewItem();
                    service.addNewItem(newItem, stores);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }
    }

    public static void searchById() {
        System.out.println("Nhap id mon do ban muon tim:");
        int id = Integer.parseInt(sc.nextLine());
        Store store = service.searchById(stores, id);
        System.out.println(store);
        submenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Nhap ten moi:");
                String newName = sc.nextLine();
                service.updateName(store, newName);
                break;

            case 2:
                System.out.println("Cap nhat gia moi:");
                long newPrice = Long.parseLong(sc.nextLine());
                service.updatePrice(store, newPrice);
                break;
            case 3:
                System.out.println("Danh sach sau khi xoa:");
                service.deleteItem(stores, store);
                service.show(stores);
                break;

            case 4:
                menu();
                break;
        }
    }
}
