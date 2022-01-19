import java.time.LocalDate;

public class Ebook extends Book{
    private LocalDate yearPublish;
    private int memory;
    private String picture;
    private int download;

    public Ebook(int id, String name, String[] category, String publishCompany, LocalDate yearPublish, int memory, String picture, int download) {
        super(id, name, category, publishCompany);
        this.yearPublish = yearPublish;
        this.memory = memory;
        this.picture = picture;
        this.download = download;
    }

    public LocalDate getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(LocalDate yearPublish) {
        this.yearPublish = yearPublish;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
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
        return super.toString()+" - "+ yearPublish +" - "+ memory+ " - "+ picture+ " - "+download;
    }
}
