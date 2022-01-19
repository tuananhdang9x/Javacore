package model;

import java.time.LocalDate;

public class Newspaper extends Book{
    private int quantity;
    private int pageNumber;

    public Newspaper(int id, String name, String[] category, String publishCompany, LocalDate yearPublish, int quantity, int pageNumber) {
        super(id, name, category, publishCompany, yearPublish);
        this.quantity = quantity;
        this.pageNumber = pageNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return super.toString()+" - "+"Số lượng:"+quantity+" - "+"Số trang:"+pageNumber;
    }
}
