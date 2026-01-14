public class Literature {
    private String sourceCode;
    private String type;
    private String title;
    private int year;
    private String publisher;
    private int pages;
    private String author;

    public Literature() {
    }

    public Literature(String sourceCode, String type, String title, int year, String publisher, int pages, String author) {
        this.sourceCode = sourceCode;
        this.type = type;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
        this.author = author;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "sourceCode='" + sourceCode + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
