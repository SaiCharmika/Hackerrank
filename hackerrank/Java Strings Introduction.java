import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings
        String A = scanner.next();
        String B = scanner.next();
        scanner.close();

        // 1. Sum of lengths of A and B
        System.out.println(A.length() + B.length());

        // 2. Lexicographical comparison
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // 3. Capitalize first letter of A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
