import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Lotto {
    public static void main(String[] args) {

        File file = new File("lotto_numbers.csv");

        try{
            file.delete();
            }catch(Exception ignored){
            }
            file = new File("lotto_numbers.csv");
        
       Coupon coupon = new Coupon(); 
       Scanner scanner = new Scanner(System.in);
       System.out.println("How many lines do you want?");
       int numLines = scanner.nextInt();
       coupon.generateLines(numLines);

       try {
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println(line);
            }
            scanner.close();
            } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            }
    }
}
