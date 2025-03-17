import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Format for US currency
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        // Format for Indian currency (Custom Locale for India)
        Locale indiaLocale = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

        // Format for Chinese currency
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        // Format for French currency
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        // Print results
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
