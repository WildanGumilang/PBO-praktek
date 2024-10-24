// ****************************************************************
// MathUtils.java
// Provides static mathematical utility functions.
// ****************************************************************

public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak didefinisikan untuk bilangan bulat negatif.");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Faktorial terlalu besar untuk bilangan bulat (overflow untuk n > 16)");
        }
        int fac = 1;

        // Calculate factorial
        for (int i = n; i > 0; i--) {
            fac *= i;
        }

        return fac;
    }
}
