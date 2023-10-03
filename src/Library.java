import java.util.ArrayList;
import java.util.Arrays;

// Biblioteksklass med alla böcker i arraylisten bookShelf och olika metoder med namn som självbeskriver vad dom gör
public class Library {

    private ArrayList<Book> bookShelf = new ArrayList<>();

    public ArrayList<Book> getBookShelf() {
        return bookShelf;
    }

    public Book searchForBookAndRentItOut(String userSearch) {
        for (Book book : bookShelf) {
            if (book.getTitle().equalsIgnoreCase(userSearch) || book.getAuthor().equalsIgnoreCase(userSearch)) {
                System.out.println("Du har precis hyrt boken: " + book);
                bookShelf.remove(book);
            }
        }
        System.out.println("Det du sökte efter matchar inget i biblioteket. Försök igen");
        return null;
    }

    public void setBookShelf(Book book) {
        bookShelf.add(book);
        System.out.println("Book added: " + book);
        System.out.println(bookShelf);
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookShelf=" + bookShelf +
                '}';
    }
}

