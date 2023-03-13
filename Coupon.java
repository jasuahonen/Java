import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Coupon {

    private static final String FILENAME = "lotto_numbers.csv";

    
    public static void generateLines(int numLines) {

        System.out.println("Lotto Numbers");
        
        for(int i=0; i<numLines; i++) {
            int[] numbers = Line.generateNumbers();
            Scanner scanner = new Scanner(System.in);
            
            for(int num : numbers) {
                System.out.print(num + " ");
            }  
            System.out.println();   
            System.out.println("Save the numbers? (y/n)");
            String save = scanner.nextLine();
                if (save.equals("y")) {
                    saveNumbers(numbers);
                } 
                else if (save.equals("n")) {
                    System.out.println();
                    i--;
                } 
                else {
                    System.out.println("Please enter y or n! Start the program again.");
                    return;
                }
        }
         System.out.println("Cost: " + numLines + ".00€");
        }

    public static void saveNumbers(int[] numbers) {

        try {
            FileWriter fw = new FileWriter(FILENAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int num : numbers) {
                bw.write(num + " ");
            }
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Numbers saved!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    } 
}

