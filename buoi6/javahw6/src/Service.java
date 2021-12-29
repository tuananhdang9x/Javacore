import java.util.Scanner;

public class Service {
    public Product inputProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap so luong:");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Chon don vi:");
        System.out.println("0 la: Goi, 1 la: Thung, 2 la: Chiec");
        int choice = Integer.parseInt(sc.nextLine());
        DonVi donVi;
        if (choice == 0) {
            donVi = DonVi.Goi;
        } else if (choice == 1) {
            donVi = DonVi.Thung;
        } else {
            donVi = DonVi.Chiec;
        }

        System.out.println("Gia nhap:");
        double giaNhap = Double.parseDouble(sc.nextLine());
        System.out.println("Gia ban:");
        double giaBan = Double.parseDouble(sc.nextLine());
        System.out.println("So luong ban:");
        int soLuongBan = Integer.parseInt(sc.nextLine());

        Product createProduct = new Product(id, ten, soLuong, donVi, giaNhap, giaBan, soLuongBan);
        return createProduct;
    }

    public Product[] addProduct(int size) {
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++) {
            products[i] = inputProduct();
        }
        return products;
    }

    public void print(Product[] products) {
        for (Product s : products) {
            System.out.println(s + " - Tien lai:" + tienLai(s.giaNhap, s.giaBan, s.soLuong));
        }
    }

    public double tienLai(double giaNhap, double giaBan, int soLuong) {
        return (giaBan - giaNhap) / soLuong;
    }
}
