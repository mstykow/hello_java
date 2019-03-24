package temp;

import java.util.Scanner;

/*
 * Convert Fahrenheit to Celsius using the terminal
 */
public class TempTerminal {
    public static void main(String[] args) {
        double fahr, cel;

        // Enclose Scanner in try-with-resources to close the I/O after use
        try (Scanner in = new Scanner(System.in)) {
            System.out.printf("Please enter temperature in degree F: ");
            fahr = in.nextDouble();
        }

        cel = (fahr - 32) * 5/9;
        System.out.println("Temperature in degree C: " + cel);
    }
}