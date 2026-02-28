class Fraction {
    private int numerator;
    private int denominator;
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
        this.denominator = denominator;
        } 
        else {
            this.denominator = 1;
        }
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator ;
    }
    public void setDenominator(int denominator) {
        if(denominator != 0) {
            this.denominator=denominator;
        }
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
    public boolean equals(Fraction f) {
        return (this.numerator*f.denominator)==(this.denominator*f.numerator);
    }
}
    public class FractionTest {
        public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(2,4);
        System.out.print("Fraction 1: ");
        f1.display();
        System.out.print("Fraction 2: ");
        f2.display();
        if(f1.equals(f2)) {
            System.out.println("Fractions are identical.");
        }
        else {
            System.out.println("Fractions are not identical.");
        }
    }
}

