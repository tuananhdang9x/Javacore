public class TextBook extends Book {
    private int source;
    private int pageNumber;
    private String author;

    public TextBook(int id, String name, String[] category, String publishCompany, int source) {
        super(id, name, category, publishCompany);
        this.source = source;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString()+ " - " + source + " - " + pageNumber+ " - " + author;
    }
}
