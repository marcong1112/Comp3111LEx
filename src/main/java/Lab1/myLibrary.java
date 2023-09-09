package Lab1;

public class myLibrary {
    public myLibrary() {
    }

    public static int Power(int Base, int Exponent) {
        return Exponent == 1 ? Base * Exponent : Base * Power(Base, Exponent - 1);
    }

    public static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }
}