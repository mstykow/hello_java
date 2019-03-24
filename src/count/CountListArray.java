package count;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.*;

/**
 * Count the occurrence of integers 0 to 9 in a given number
 */
public class CountListArray {
    public static void main(String[] args) {
        int idx;

        String input = JOptionPane.showInputDialog("Enter a number:");
        int inputLength = input.length();

        List<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            count.add(0);
        }

        for (int i = 0; i < inputLength; i++) {
            idx = Character.getNumericValue(input.charAt(i));
            count.set(idx, count.get(idx) + 1);
        }

        // Equivalent of `enumerate` in Python
        ListIterator<Integer> it = count.listIterator();
        while (it.hasNext()) {
            int currentIdx = it.nextIndex();
            int currentVal = it.next();
            if (currentVal != 0 ) {
                System.out.println(currentIdx + " occurred " + currentVal + " times.");
            }
        }
    }
}