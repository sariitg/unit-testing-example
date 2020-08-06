package example.tdd;

public class Calculator {

    public double divide(double x, double y) {
        double results = x / y;
        if (results == Double.POSITIVE_INFINITY || results == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Can't divide by 0");
        }
        return results;
    }
    
}
