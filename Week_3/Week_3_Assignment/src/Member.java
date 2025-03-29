/**
 * Represents a member of the library.
 * A member can borrow and return books from the library.
 */
public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Allows the member to borrow a book if it's available.
     * @param book The book to borrow.
     */
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available for borrowing.");
        }
    }

    /**
     * Allows the member to return a book they've borrowed.
     * @param book The book to return.
     */
    public void returnBook(Book book) {
        book.returnBook();
        System.out.println(name + " returned the book: " + book.getTitle());
    }
}