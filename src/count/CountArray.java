package count;

import javax.swing.*;

/*
 * Count the occurrence of integers 0 to 9 in a given number using an array
 */
public class CountArray {
    public static void main(String[] args) {
        int idx;

        String input;
        input = JOptionPane.showInputDialog("Enter a number:");
        int inputLength = input.length();

        int[] count = new int[10];

        for (int i = 0; i < inputLength; i++) {
            idx = Character.getNumericValue(input.charAt(i));
            count[idx] = count[idx] + 1;
        }
        
        idx = 0;
        for (int i : count) {
            System.out.println(idx + " occurred " + i + " times.");
            idx++;
        }
    }
}