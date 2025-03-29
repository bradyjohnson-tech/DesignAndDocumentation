import java.util.*; // importing java.util aka code re-use
/**
 * Use this command to generate javadocs: javadoc src/SaveIntToAStack.java -d docs
 * <p>
 * Hi professor, at first look this code may look like I re-wrote the program. However, I did not. You will notice that
 * I extracted the input portion of the code into its own method to simplify the main method. Further I kept the variable name
 * 'numbers' the same and only had to change the type of this variable from LinkedList to Stack. I was forced to do
 * the sorting before adding to the stack becuase a stack un-like LinkedList, Stack does not have a method in the
 * Collections package for sorting. Even so the important part of the final product remaining the same is retained.
 * <p>
 * Main gets a list of comma separated integers, then sorts the integer and places them into a stack.
 * <p>
 * Usage: <br>
 * - Run the program and provide a comma-separated list of integers as input.<br>
 * - The program will parse and sort the integers, then display the sorted list.<br>
 * <p>
 * Key Features:<br>
 * - Uses a Stack to store integers.<br>
 * - Leverages Collections.sort() to perform sorting.<br>
 */
public class SaveIntToAStack {
    public static Scanner _scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>(); // numbers used to be of type LinkedList
        List<Integer> listOfIntegers = GetInput();
        Collections.sort(listOfIntegers); // code re-use

        numbers.addAll(listOfIntegers);
        System.out.println("Sorted Stack: " + numbers);
    }
/**
 * GetInput prompts the user to enter a comma-separated list of integers, validates the input,
 * and returns a list of valid integers.
 *
 * @return A list containing integers entered by the user.
 *
*/
    public static List<Integer> GetInput()
    {
        List<Integer> listOfIntegers = new ArrayList<>();
        System.out.println("Enter a comma-separated list of integers:");
        String input = _scanner.nextLine();
        String[] values = input.split(",");

        for (String value : values) {
            try {
                int number = Integer.parseInt(value.trim());
                listOfIntegers.add(number); // code re-use
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + value.trim() + "'. Please ensure all values are valid integers.");
            }
        }
        return listOfIntegers;
    }
}