package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * Fibonacci sequence implementation
 */
public class Fibonacci {

    // Recursive implementation with runtime O(~1.6 ** n)
    public static Integer fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Memoized recursive version
    public static TreeMap<Integer, Integer> hist = new TreeMap<Integer, Integer>();
    public static Integer fibMem(int n) {
        if (n <= 1) {
            hist.put(n, n);
            return n;
        } else if (hist.containsKey(n)) {
            return hist.get(n);
        } else {
            int newEntry = fibMem(n - 1) + fibMem(n - 2);
            hist.put(n, newEntry);
            return newEntry;
        }
    }

    // Iterative implementation with runtime O(n)
    public static Integer fibIt(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }

    public static void main(String[] args) {
        List<Integer> seq = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            seq.add(fib(i));
        }
        for (int i = 5; i < 10; i++) {
            seq.add(fibMem(i));
        }
        for (int i = 10; i < 15; i++) {
            seq.add(fibIt(i));
        }
        System.out.println(hist.values());
        System.out.println(Arrays.toString(seq.toArray()));
    }
}