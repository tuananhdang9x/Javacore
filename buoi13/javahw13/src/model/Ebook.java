package model;

import java.time.LocalDate;

public class Ebook extends Book{
    private int data;
    private String picture;
    private int download;

    public Ebook(int id, String name, String[] category, String publishCompany, LocalDate yearPublish, int data, String picture, int download) {
        super(id, name, category, publishCompany, yearPublish);
        this.data = data;
        this.picture = picture;
        this.download = download;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    @Override
    public String toString() {
        return super.toString()+" - "+"Dung lượng:"+data+"GB"+" - "+"Ảnh thumbnail:"+picture+" - "+"Lượt tải:"+download;
    }
}
