package model;

import java.time.LocalDate;

public class TextBook extends Book {
    private int quantity;
    private int pageNumber;
    public String author;

    public TextBook(int id, String name, String[] category, String publishCompany, LocalDate yearPublish, int quantity, int pageNumber, String author) {
        super(id, name, category, publishCompany, yearPublish);
        this.quantity = quantity;
        this.pageNumber = pageNumber;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString()+" - "+"Số lượng:"+quantity+" - "+"Số trang:"+pageNumber+" - "+"Tác giả:"+author;
    }
}
