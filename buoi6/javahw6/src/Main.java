public class Main {
    public static void main(String[] args) {
        Service sanPham = new Service();
        Product[] products = sanPham.addProduct(2);
        sanPham.print(products);
    }
}