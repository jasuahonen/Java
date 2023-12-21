public class StringReversal {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseString(String str) {
        // Base case: when the string is empty or has only one character
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            // Recursive case: reverse the substring excluding the first character
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
