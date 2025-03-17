import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        String S = scanner.next();
        
        // Read start and end indices
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        scanner.close();

        // Extract and print substring from start to end (excluding end)
        System.out.println(S.substring(start, end));
    }
}
