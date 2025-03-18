import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = Integer.parseInt(scanner.nextLine());  // Read number of test cases
        while (t-- > 0) {
            String pattern = scanner.nextLine();  // Read each regex pattern
            try {
                // Try to compile the regex pattern
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // If compilation fails, it's an invalid pattern
                System.out.println("Invalid");
            }
        }
        
        scanner.close();
    }
}
