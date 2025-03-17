import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Iterate through all substrings of length 'k'
        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            
            // Update smallest and largest based on lexicographical comparison
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string and integer
        String s = scanner.next();
        int k = scanner.nextInt();
        
        scanner.close();
        
        // Print the result
        System.out.println(getSmallestAndLargest(s, k));
    }
}
