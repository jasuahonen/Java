/**
 * SolveTowers uses recursion to solve the Towers of Hanoi puzzle.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
// public class SolveTowers
// {
//     /**
//      * Creates a TowersOfHanoi puzzle and solves it.
//      */
//     public static void main(String[] args)
//     {
//         TowersOfHanoi towers1 = new TowersOfHanoi(1);
//         towers1.solve();
//         System.out.println("Next:");
//         TowersOfHanoi towers2 = new TowersOfHanoi(2);
//         towers2.solve();
//         System.out.println("Next:");
//         TowersOfHanoi towers3 = new TowersOfHanoi(3);
//         towers3.solve();
//         System.out.println("Next:");
//         TowersOfHanoi towers4 = new TowersOfHanoi(4);
//         towers4.solve();
//         System.out.println("Next:");
//         TowersOfHanoi towers5 = new TowersOfHanoi(5);
//         towers5.solve();
//         System.out.println("Next:");
//         TowersOfHanoi towers6 = new TowersOfHanoi(6);
//         towers6.solve();

//     }
// } original code above
public class SolveTowers
{
    public static void main(String[] args)
    {
        printMoves(1);
        printMoves(2);
        printMoves(3);
        printMoves(4);
        printMoves(5);
        printMoves(6);
        printMoves(7);
        printMoves(8);
        printMoves(9);
        printMoves(10);
    }

    private static void printMoves(int numDisks)
    {
        TowersOfHanoi towers = new TowersOfHanoi(numDisks);
        int moves = towers.solve();
        System.out.println("Number of moves to solve with " + numDisks + " disks: " + moves);
        System.out.println("Next:");
    }
}

