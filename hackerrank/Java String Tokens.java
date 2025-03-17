import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Initialize the scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Split the string using regular expression that matches non-alphabetic characters
        String[] tokens = input.split("[^A-Za-z]+");

        // The split method might result in empty strings, so filter them out
        int tokenCount = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenCount++;
            }
        }

        // Print the number of tokens
        System.out.println(tokenCount);

        // Print each token on a new line
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
