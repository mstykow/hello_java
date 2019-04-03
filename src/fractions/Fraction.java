package fractions;

/**
 * fractions
 */
@SuppressWarnings("serial")
public class Fraction extends Number implements Comparable<Fraction> {

    private int num = 1;
    private int den = 1;
    private int sgn = 1;

    public Fraction(int num, int den) {
        this.num = Math.abs(num);
        this.den = Math.abs(den);
        if (((num < 0) && (den > 0)) || ((num > 0) && (den < 0))) {
            this.sgn = -1;
        }
    }

    // Constructor overloading for single int and double
    public Fraction(Object other) {
        if (other.getClass() == Integer.class) {
            int num = (int) other;
            this.num = Math.abs(num);
            if (num < 0) {
                this.sgn = -1;
            }
        } else if (other.getClass() == Double.class) {
            double num = (double) other;
            while (num != Math.round(num)) {
                this.den = den * 10;
                num = num * 10;
            }
            this.num = (int) num;
            this.simplify();
            if (num < 0) {
                this.sgn = -1;
            }
        } else {
            throw new RuntimeException("Cannot create fraction.");
        }
    }

    public void simplify() {
        if (this.num != 0) {
            int a = this.den;
            int b = this.num;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
            int gcd = b;
            this.num = this.num / gcd;
            this.den = this.den / gcd;
        }
    }

    // Equivalent of __repr__
    public String toString() {
        if (this.num == 0) {
            return "0";
        } else if (this.den == 1) {
            return this.sgn * this.num + "";
        }
        else {
            return this.sgn * this.num + "/" + this.den;
        }
    }

    public Fraction add(Fraction other) {
        int newNum, newDen;
        newDen = this.den * other.den;
        newNum = this.sgn * this.num * other.den + other.sgn * other.num * this.den;
        Fraction sum = new Fraction(newNum, newDen);
        sum.simplify();
        return sum;
    }

    // Method overloading for other types
    public Fraction add(Object other) {
        return add(new Fraction(other));
    }

    public Fraction sub(Fraction other) {
        int newNum, newDen;
        newDen = this.den * other.den;
        newNum = this.sgn * this.num * other.den - other.sgn * other.num * this.den;
        Fraction diff = new Fraction(newNum, newDen);
        diff.simplify();
        return diff;
    }

    // Method overloading for other types
    public Fraction sub(Object other) {
        return sub(new Fraction(other));
    }

    public Fraction mul(Fraction other) {
        int newNum, newDen;
        newDen = this.den * other.den;
        newNum = this.sgn * this.num * other.sgn * other.num;
        Fraction prod = new Fraction(newNum, newDen);
        prod.simplify();
        return prod;
    }

    // Method overloading for other types
    public Fraction mul(Object other) {
        return mul(new Fraction(other));
    }

    public Fraction div(Fraction other) {
        int newNum, newDen;
        newDen = this.den * other.num;
        newNum = this.sgn * this.num * other.sgn * other.den;
        Fraction quot = new Fraction(newNum, newDen);
        quot.simplify();
        return quot;
    }

    // Method overloading for other types
    public Fraction div(Object other) {
        return div(new Fraction(other));
    }

    public boolean equals(Fraction other) {
        if (other == null) {
            return false;
        } else {
            return this.sub(other).num == 0;
        }
    }

    public int compareTo(Fraction other) {
        Fraction diff = this.sub(other);
        return diff.sgn * diff.num;
    }

    // Method overloading for other types, note: this will throw
    // an info in the problem tab
    public boolean equals(Object other) {
        return equals(new Fraction(other));
    }

    // Methods needed to inherit from Number class
    public double doubleValue() { return ((double) num) / ((double) den); }
    public float floatValue() { return ((float) num) / ((float) den); }
    public int intValue() { return num / den; }
    public long longValue() { return ((long) num) / ((long) den); }
}