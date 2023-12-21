
// Class 2
// Main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		// Case 1 : Integer Queue

		// Creating object of queue Class (user defined)
		// Declaring object of integer type
		queue<Integer> q1 = new queue<>();

		// Pushing elements to the integer object created
		// Custom input integer entries
		q1.enqueue(5);
		q1.enqueue(10);
		q1.enqueue(20);

		// Print the queue after inserting integer elements
		System.out.println(
			"q1 after enqueue of 3 elements:\n" + q1);
		q1.dequeue();
		System.out.println("q1 after dequeue :\n" + q1);

		// Case 2 : String Queue

		// Creating object of queue Class (user defined)
		// Declaring object of string type
		queue<String> q2 = new queue<>();

		// Pushing elements to the String object created
		// Custom input string entries
		q2.enqueue("hello");
		q2.enqueue("world");
		q2.enqueue("GFG");

		// Print the queue after inserting string elements
		System.out.println(
			"\nq2 after enqueue of 3 elements:\n" + q2);

		// Printing front and rear of the above queue
		System.out.println("q2 front = " + q2.front()
						+ ", q2 rear = " + q2.rear());

		// Case 3 : Float Queue

		// Creating object of queue Class (user defined)
		// Declaring object of float type
		queue<Float> q3 = new queue<>();

		// Display message only
		System.out.println(
			"\nCreated new Float type queue q3...");

		// Display whether queue is empty or not
		// using the empty() method
		System.out.println(
			"Checking if queue is empty or not :\n"
			+ q3.empty());
	}
}
