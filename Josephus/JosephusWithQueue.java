import java.util.*;

/**
 * Demonstrates the use of a queue to solve the Josephus problem.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class JosephusWithQueue {
    public static void main(String[] args) {
        int numPeople, skip;
        Queue<String> queue = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        // Get the initial number of soldiers
        System.out.print("Enter the number of soldiers: ");
        numPeople = in.nextInt();
        in.nextLine();

        // Get the number of soldiers to skip
        System.out.print("Enter the number of soldiers to skip: ");
        skip = in.nextInt();

        // Load the initial queue of soldiers
        for (int count = 1; count <= numPeople; count++) {
            queue.offer("Soldier " + count);
        }

        System.out.println("The order is: ");

        // Continue eliminating soldiers until the queue is empty
        while (!queue.isEmpty()) {
            for (int i = 1; i < skip; i++) {
                // Move the skipped soldiers to the end of the queue
                queue.offer(queue.poll());
            }
            // Remove and print the eliminated soldier
            System.out.println(queue.poll());
        }
    }
}
