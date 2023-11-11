package int101.work01;

public class Utilitor {
    public static String testString(String value) {
        if (value == null)
            throw new NullPointerException();
        if (value.isBlank())
            throw new IllegalArgumentException();
        return value;
    }

    public static double testPositive(double value) {
        if (value < 0)
            throw new IllegalArgumentException();
        return value;
    }

    public static long computeIsbn10(long isbn10) {
        if (isbn10 >= Math.pow(10, 9))
            throw new IllegalArgumentException();
        return 11 - computeIsbn10Helper(isbn10, 2) % 11;
    }

    private static long computeIsbn10Helper(long isbn10, int n) {
        if (n > 9) {
            return isbn10 % 10 * n;
        }
        return computeIsbn10Helper(isbn10 / 10, n + 1) + (isbn10 % 10 * n);
    }
}
