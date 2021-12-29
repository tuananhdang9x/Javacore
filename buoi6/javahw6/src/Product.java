public class Product {
    public int id;
    public String ten;
    public int soLuong;
    public DonVi donVi;
    public double giaNhap;
    public double giaBan;
    public int soLuongBan;

    public Product(int id, String ten, int soLuong, DonVi donVi, double giaNhap, double giaBan, int soLuongBan) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
    }

    @Override
    public String toString() {
        return "ID:" + id + " - " + "Ten:" + ten + " - " + "So luong:" + soLuong + " - " + "Don vi:" + donVi + " - "
                + "Gia nhap:" + giaNhap + " - " + "Gia ban:" + giaBan + " - " + "So luong ban:" + soLuongBan;
    }

}
