public class EuclideanAlgorithm {
    public static void main(String[] args) {
        // Test the gcd method
        int x = 860;
        int y = 20;

        int result = gcd(x, y);

        System.out.println("The GCD of " + x + " and " + y + " is: " + result);
    }

    // Recursive Euclidean algorithm to find the GCD
    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
