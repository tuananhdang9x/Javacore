package model;

import java.util.Arrays;

public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private long quantity;
    private int saleNumber;
    private String brand;
    private String[] category;

    public Product(int id, String name, String description, long price, long quantity, int saleNumber, String brand, String[] category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.saleNumber = saleNumber;
        this.brand = brand;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public int getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(int saleNumber) {
        this.saleNumber = saleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm:"+id+" - "+"Tên:"+name+" - "+"Mô tả:"+description+" - "+"Giá:"+price+" - "+"Số lượng:"+quantity+" - "+"Số lượng bán:"+saleNumber+" - "+"Hãng:"+brand+" - "+"Danh mục:"+Arrays.toString(category);
    }
}
