public class Book {
    private String title;
    private String author;
    private int totalPages;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "  title = " + title +
                "  author = " + author +
                "  totalPages = " + totalPages + "\n"
                ;
    }
}
