import java.util.*;

/**
 * Use this command to generate javadocs: javadoc src/Main.java -d docs
 * <p>
 * Hi professor, I asked Jetbrains AI to write this documentation, it queued up pretty well on the comments I wrote in
 * the code and I am pretty happy with it. I did have to add the line breaks, paragraph markers and escape sequences though. <br>
 * Below this is AI generated documentation:
 * <p>
 * The Main class demonstrates reading a list of integers from the user,
 * parsing the input, sorting the integers using Java's Collections framework,
 * and displaying the sorted list. It ensures invalid input is handled gracefully.
 * <p>
 * Usage: <br>
 * - Run the program and provide a comma-separated list of integers as input.<br>
 * - The program will parse and sort the integers, then display the sorted list.<br>
 * <p>
 * Key Features:<br>
 * - Uses a LinkedList to store integers.<br>
 * - Employs try-catch for input validation. &lt;= This is kinda a dumb point, but I am leaving it to show you.<br>
 * - Leverages Collections.sort() to perform sorting.<br>
 */

public class Main {
    /**
     * This is slightly redundant but adding anyway.
     * AI Generated Below:<br>
     * The main method that serves as the entry point of the program. It allows the user
     * to input a comma-separated list of integers, validates and parses the input, sorts
     * the integers, and displays the sorted list.
     *
     * @param args Command-line arguments (not utilized in this program).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> numbers = new LinkedList<>(); // Code re-use in action here, using the collection framework to create the LinkedList

        System.out.println("Enter a comma-separated list of integers:");

        String input = scanner.nextLine(); // Using the system library for reading the test input from the terminal.

        String[] values = input.split(","); // Getting out scanned input and delimiting by a "," and adding each int to a list.

        for (String value : values) {
            try {
                int number = Integer.parseInt(value.trim()); // Using the System library to parse the integers.
                numbers.add(number); // Using the collection framework to add to the LinkedList.
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + value.trim() + "'. Please ensure all values are valid integers.");
            }
        }

        Collections.sort(numbers); // Code re-use in action here, using the collections framework to do the sort.

        System.out.println("Sorted LinkedList: " + numbers);
    }
}