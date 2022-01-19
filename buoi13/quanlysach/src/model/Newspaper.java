import java.time.LocalDate;

public class Newspaper extends Book{
    private LocalDate datePublish;
    private int source;
    public int pageNumber;

    public Newspaper(int id, String name, String[] category, String publishCompany, LocalDate datePublish, int source, int pageNumber) {
        super(id, name, category, publishCompany);
        this.datePublish = datePublish;
        this.source = source;
        this.pageNumber = pageNumber;
    }

    public LocalDate getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(LocalDate datePublish) {
        this.datePublish = datePublish;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return super.toString()+" - "+ datePublish+ " - "+ source +" - "+ pageNumber;
    }
}
