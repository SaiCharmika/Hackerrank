import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String s = scanner.next();
        scanner.close();
        
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(s).reverse().toString();
        
        // Check if the original and reversed strings are the same
        if (s.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
