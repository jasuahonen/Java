import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// Working hours log

// 21.11. Working on the project for 2,5 hours. 20.00-22.30
//
//

public class SearchAndSortApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Implementing a menu using while-loop with a switch-loop to allow user selection.

        while (true) {
            System.out.println("");
            System.out.println("Menu of Searching and Sorting Testbed.");
            System.out.println("");
            System.out.println("1)  Linear searching");
            System.out.println("2)  Binary searching");
            System.out.println("3)  O(n^2) type of sorting");
            System.out.println("4)  O(n*log(n)) type of sorting");
            System.out.println("5)  Sorting performance");
            System.out.println("");
            System.out.println("Q/q)    Quit");

            String choice = scanner.next().toUpperCase();

// Implementing the menu-options using cases, making the choice a "string" so we can use both letters and numbers.

            switch (choice) {

// Case 1 for Linear searching
                case "1":
                    int[] arrayLinear = {0, 5, 2, 8, 1, 7, 3, 9, 4, 6};
                    System.out.println("Your choice: 1");
                    System.out.println("In the list are values 0, .... 9; which value would you like to search with Linear search?");
                    int searchLinear = scanner.nextInt();
                    boolean isFound = linearSearch(arrayLinear, searchLinear);
                    if (isFound) {
                        System.out.println("Number found!");
                    } else {
                        System.out.println("Number not found");
                    }
                    waitForEnter();
                    break;

// Case 2 for Binary searching
                case "2":
                    int[] arrayBinary = {0, 5, 2, 8, 1, 7, 3, 9, 4, 6};
                    System.out.println("Your choice: 2");
                    System.out.println("In the list are values 0, .... 9; which value would you like to search with Binary search?");
                    int searchBinary = scanner.nextInt();
                    boolean isFoundBinary = binarySearch(arrayBinary, searchBinary);
                    if (isFoundBinary) {
                        System.out.println("Number found!");
                    } else {
                        System.out.println("Number not found.");
                    }
                    waitForEnter();
                    break;

// Case 3 for O(n^2) sorting
                case "3":
                    System.out.println("Your choice: 3");
                    System.out.println("");
                    generateAndSortRandomNumbersQuadratic();
                    waitForEnter();
                    break;

// Case 4 for O(n*log(n)) sorting
                case "4":
                    System.out.println("Your choice: 4");
                    System.out.println("");
                    generateAndSortRandomNumbersLogarithmic();
                    waitForEnter();
                    break;

// Case 5 we didn't implement so print out a note if user chooses that
                case "5":
                    System.out.println("Case 5 not implemented");
                    break;

// Case Q/q for Quit. Used .toUpperCase() so that both letters work
                case "Q":
                 System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;

// Default for user input error
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 to 5 or Quit.");
                    break;
            }
        }
    }

// METHODS -------- METHODS ---------- METHDOS

// Method for case 1) Linear search
private static boolean linearSearch(int[] arrayLinear, int target) {
        for (int num : arrayLinear) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
// Method for case 2) Binary search
private static boolean binarySearch(int[] arrayBinary, int target) {
        Arrays.sort(arrayBinary); // Sorting before binary search
        int left = 0;
        int right = arrayBinary.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arrayBinary[mid] == target) {
                return true;
            } else if (arrayBinary[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

// Method for case 3) O(n^2) type of sorting
    private static int[] generateAndSortRandomNumbersQuadratic() {
        int[] array = generateRandomNumbers();

                System.out.println("Data set before Bubble-sort:");
                System.out.println(Arrays.toString(array));
                System.out.println("");

        // Bubble sort (O(n^2))
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
            System.out.println("Data set after Bubble-sort:");
            System.out.println(Arrays.toString(array));
            System.out.println("");

        return array;
    }

// Method for case 4) O(n*log(n)) type of sorting
    private static int[] generateAndSortRandomNumbersLogarithmic() {
        int[] array = generateRandomNumbers();

            System.out.println("Data set before Merge-sort:");
            System.out.println(Arrays.toString(array));
            System.out.println("");

        // Merge sort (O(n*log(n)))
        Arrays.sort(array);

            System.out.println("Data set after Merge-sort:");
            System.out.println(Arrays.toString(array));
            System.out.println("");

        return array;
    }

// Method for generating the random numbers for case 3 and 4 unsorted arrays
    private static int[] generateRandomNumbers() {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(199) - 99; // Random number between -99 and 99
        }

        return array;
    }

// Method for slowing down the program to give the user time to read the results, "press enter to continue"
    private static void waitForEnter() {
        System.out.println("Press Enter to continue...");
        new Scanner(System.in).nextLine();
    }
}
