package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Store;

import java.util.ArrayList;

public class StoreService {
    public ArrayList<Store> getAllStore() {
        ArrayList<Store> stores = new ArrayList<>();
        stores.add(new Store(1, "Quan ao tre em", 100000, 10, "Thoi trang", 2));
        stores.add(new Store(2, "Quan ao nam", 120000, 20, "Thoi trang", 5));
        stores.add(new Store(3, "Quan ao phu nu", 120000, 28, "Thoi trang", 4));

        return stores;
    }

    public void show(ArrayList<Store> stores) {
        for (Store s : stores) {
            System.out.println(s);
        }
    }

    public void searchByName(ArrayList<Store> stores, String searchName) {
        for (Store s : stores) {
            if (s.getTen().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    public Store searchById(ArrayList<Store> stores, int id) {
        for (Store s : stores) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void updateName(Store store, String newName) {
        store.setTen(newName);
        System.out.println(store);
    }

    public void updatePrice(Store store, long newPrice) {
        store.setGiaBan(newPrice);
    }

    public void deleteItem(ArrayList<Store> stores, Store store) {
        stores.remove(store);
    }

    public Store createNewItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten");
        String ten = sc.nextLine();
        System.out.println("Nhap gia ban:");
        long giaBan = Long.parseLong(sc.nextLine());
        System.out.println("Nhap so luong:");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap loai hang:");
        String loaiHang = sc.nextLine();
        System.out.println("So luong ban:");
        int soLuongBan = Integer.parseInt(sc.nextLine());

        Store newItem = new Store(id, ten, giaBan, soLuong, loaiHang, soLuongBan);

        return newItem;
    }

    public void addNewItem(Store store, ArrayList<Store> stores) {
        stores.add(store);
    }

}
