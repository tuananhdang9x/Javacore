
package model;

public class Store {
    private int id;
    private String ten;
    private long giaBan;
    private int soLuong;
    private String loaiHang;
    private int soLuongBan;

    public Store(int id, String ten, long giaBan, int soLuong, String loaiHang, int soLuongBan) {
        this.id = id;
        this.ten = ten;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.loaiHang = loaiHang;
        this.soLuongBan = soLuongBan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    @Override
    public String toString() {
        return "ID:" + id + " - " + "Ten:" + ten + " - " + "Gia ban:" + giaBan + " - " + "So luong:" + soLuong + " - "
                + "Loai mat hang:" + loaiHang + " - " + "So luong ban:" + soLuongBan;
    }

}
