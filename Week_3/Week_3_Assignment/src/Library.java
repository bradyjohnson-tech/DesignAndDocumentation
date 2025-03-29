import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages a collection of books.
 * It allows adding books to the collection and printing the available books.
 */
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library's collection.
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    /**
     * Prints all the available books in the library.
     */
    public void printAvailableBooks() {
        System.out.println("\nAvailable Books in Library:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}
