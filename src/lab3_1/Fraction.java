package src.lab3_1;

public class Fraction {
    int m, n;

    public Fraction() {
        m = 0;
        n = 1;
    }

    public Fraction(int m) {
        this.m = m;
        n = 1;
    }

    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public Fraction(Fraction a) {
        m = a.m;
        n = a.n;
    }


    public Fraction Add(Fraction term) {

        Fraction sum = new Fraction();
        sum.n = this.n * term.n;
        sum.m = m * term.n + term.m * n;

        return sum;
    }

    public Fraction Multiply(Fraction term) {

        return new Fraction(
                m * term.m,
                n * term.n
        );
    }

    public Fraction Invert() {

        return new Fraction(-m, n);
    }

    public Fraction Subtract(Fraction term) {

        Fraction inverted_term = new Fraction(term.Invert());

        return this.Add(inverted_term);
    }

    public Fraction Switch() {
        return new Fraction(n, m);
    }

    public Fraction Divide(Fraction term) {

        Fraction switched_multiplicator = term.Switch();

        return this.Multiply(switched_multiplicator);
    }

    public String toString() {
        return m + "/" + n;
    }
}

