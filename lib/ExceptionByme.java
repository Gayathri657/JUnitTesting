package lib;

public class ExceptionByme {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Enter a non zero argument");
        }
        return a / b;

    }

}