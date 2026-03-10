final class Fraction {
    private final int numerator;
    private final int denominator;
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public Fraction add(Fraction f) {
        int newNumerator = this.numerator * f.getDenominator() + f.getNumerator() * this.denominator;
        int newDenominator = this.denominator * f.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction subtract(Fraction f) {
        int num = this.numerator * f.getDenominator() - f.getNumerator() * this.denominator;
        int den = this.denominator * f.getDenominator();
        return new Fraction(num, den);
    }
    public Fraction multiply(Fraction f) {
        int num = this.numerator * f.getNumerator();
        int den = this.denominator * f.getDenominator();
        return new Fraction(num, den);
    }
    public Fraction divide(Fraction f) {
        if (f.getNumerator() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int num = this.numerator * f.getDenominator();
        int den = this.denominator * f.getNumerator();
        return new Fraction(num, den);
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
}
public class FractionDemo {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f1 + f2: " + f1.add(f2));
        System.out.println("f1 - f2: " + f1.subtract(f2));
        System.out.println("f1 * f2: " + f1.multiply(f2));
        System.out.println("f1 / f2: " + f1.divide(f2));
    }
}