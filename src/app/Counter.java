package app;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.*;

/**
 * Count the occurrence of integers 0 to 9 in a given number
 */
public class Counter {
    public static void main(String[] args) {
        int idx;

        String input;
        input = JOptionPane.showInputDialog("Enter a number:");
        int inputLength = input.length();

        ArrayList<Integer> count;
        count = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            count.add(0);
        }

        for (int i = 0; i < inputLength; i++) {
            idx = Character.getNumericValue(input.charAt(i));
            count.set(idx, count.get(idx) + 1);
        }

        // Equivalent of enumerate in Python
        ListIterator<Integer> it = count.listIterator();
        while (it.hasNext()) {
            int currentIdx = it.nextIndex();
            int currentVal = it.next();
            if (currentVal != 0 ) {
                System.out.println(currentIdx + " occurred " + currentVal + " times.");
            }
        }

        // Or add an index to the for loop
//        idx = 0;
//        for (Integer i : count) {
//            System.out.println(idx + " occurred " + i + " times.");
//            idx++;
//        }
    }
}