package count;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

/*
 * Count the frequency of words in a given file
 */
public class CountTreeMap {
    public static void main(String[] args) {
        Scanner data = null;
        try {
            // File needs to be stored in project root directory
            data = new Scanner(new File("lorem_ipsum.txt"));
        }
        catch ( IOException e) {
            System.out.println("Unable to open data file.");
            e.printStackTrace();
            System.exit(0);
        }

        TreeMap<String, Integer> dict = new TreeMap<String, Integer>();
        
        while (data.hasNext()) {
            // Use regex to remove periods and commata
            String word = data.next().toLowerCase().replaceAll("[\\.,]", "");
            Integer wordCount = dict.get(word);
            // Java's equivalent of Python's dict.setdefault
            if (wordCount == null) {
                wordCount = 0;
            }
            dict.put(word, wordCount + 1);
        }

        for (String i : dict.keySet()) {
            System.out.printf("%-20s occured %5d times\n", i, dict.get(i) );
        }
    }
}