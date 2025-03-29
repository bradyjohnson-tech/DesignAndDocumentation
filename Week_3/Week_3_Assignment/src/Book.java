/**
 * Represents a book in a library system.
 * Each book has a title, an author, and an availability status.
 * Books can be borrowed and returned, which updates their availability.
 */
public class Book {
    /**
     * The title of the book.
     */
    private String title;

    /**
     * The author of the book.
     */
    private String author;

    /**
     * The availability status of the book.
     * If {@code true}, the book is available for borrowing.
     * If {@code false}, the book is currently borrowed.
     */
    private boolean isAvailable;

    /**
     * Constructs a new {@code Book} object with the specified title and author.
     * By default, a new book is marked as available.
     *
     * @param title  The title of the book.
     * @param author The author of the book.
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    /**
     * Returns the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Checks whether the book is currently available for borrowing.
     *
     * @return {@code true} if the book is available, {@code false} otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Borrows the book by marking it as unavailable.
     * If the book is already borrowed, a message is printed indicating this.
     */
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    /**
     * Returns the book by marking it as available.
     */
    public void returnBook() {
        isAvailable = true;
    }

    /**
     * Returns a string representation of the book, including its title,
     * author, and availability status.
     *
     * @return A string containing the book's title, author, and availability.
     */
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " | " + (isAvailable ? "Available" : "Not Available");
    }
}