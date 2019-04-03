package fractions;

import java.util.Arrays;

/**
 * FractionFactory
 */
public class FractionFactory {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1);
        Fraction f3 = new Fraction(4, 2);
        Fraction f4 = new Fraction(2.5);
        Fraction f5 = new Fraction(-2);
        Fraction[] myFracs = {f1, f2, f3, f4, f5};
        
        System.out.println("fractions (f1 to f5): " + Arrays.toString(myFracs));
        f3.simplify();
        System.out.println("f3 simplified: " + f3);
        System.out.println("f1 + f2: " + f1.add(f2));
        System.out.println("f1 - 1.5: " + f1.sub(1.5));
        System.out.println("f1 = f2? " + f1.equals(f2));
        System.out.println("f5 = -2?: " + f5.equals(-2));
        System.out.println("f1 * f3: " + f1.mul(f3));
        System.out.println("f1 / f3: " + f1.div(f3));
        System.out.println("f1 to int: " + f1.intValue());

        Arrays.sort(myFracs);
        System.out.println("fractions sorted: " + Arrays.toString(myFracs));
    }
}