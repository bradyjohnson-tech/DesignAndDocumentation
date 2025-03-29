// Main class to test the interactions
public class Main {
    public static void main(String[] args) {
        // Create the library
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Print available books
        library.printAvailableBooks();

        // Add a member
        Member member = new Member("Alice");

        // Borrow and return books
        member.borrowBook(book1); // Alice borrows "1984"
        library.printAvailableBooks(); // Check which books are available
        member.returnBook(book1); // Alice returns "1984"
        library.printAvailableBooks(); // Check availability again
    }
}








