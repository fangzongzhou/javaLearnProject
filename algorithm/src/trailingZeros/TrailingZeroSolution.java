package trailingZeros;

public class TrailingZeroSolution {
    public static long trailingZeros(long n) {
        long result = 0;
        while (n >= 5) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeros(25));
    }
}
