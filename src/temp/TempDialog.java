package temp;

import javax.swing.*;

/**
 * Convert Fahrenheit to Celsius using the dialog boxes
 */
public class TempDialog {
    public static void main(String[] args) {
        String fahrString;
        Double fahr, cel;

        fahrString = JOptionPane.showInputDialog("Enter the temperature in F");
        fahr = Double.valueOf(fahrString);
        cel = (fahr - 32) * 5.0/9.0;

        JOptionPane.showMessageDialog(null, "The temperature in C is, " + cel);
    }

}