package model;

import java.time.LocalDate;
import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String[] category;
    private String publishCompany;
    private LocalDate yearPublish;

    public Book(int id, String name, String[] category, String publishCompany, LocalDate yearPublish) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.publishCompany = publishCompany;
        this.yearPublish = yearPublish;
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

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }

    public LocalDate getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(LocalDate yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "ID:"+id+" - "+"Tên:"+name+" - "+"Thể loại:"+Arrays.toString(category)+" - "+"Nhà xuất bản:"+publishCompany+" - "+"Năm xuất bản:"+yearPublish;
    }
}
