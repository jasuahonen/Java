public class RecursiveSum {
    public static void main(String[] args) {
        int N = 7;
        int result = recursiveSum(1, N);
        System.out.println("The sum of integers from 1 to " + N + " is: " + result);
    }

    private static int recursiveSum(int start, int end) {
        if (start == end) {
            return start;
        } else {
            int mid = (start + end) / 2;
            return recursiveSum(start, mid) + recursiveSum(mid + 1, end);
        }
    }
}
