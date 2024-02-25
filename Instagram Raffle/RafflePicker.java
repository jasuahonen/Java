import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RafflePicker {

    public static void main(String[] args) {
        // Replace 'path/to/your/file.txt' with the actual path to your .txt file
        String filePath = "participants.txt";

        try {
            ArrayList<String> entries = readEntries(filePath);
            if (!entries.isEmpty()) {
                String winner = pickWinner(entries);
                System.out.println("The winner is: @" + winner);
            } else {
                System.out.println("No entries found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> readEntries(String filePath) throws IOException {
        ArrayList<String> entries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                entries.add(line.trim());
            }
        }

        return entries;
    }

    private static String pickWinner(ArrayList<String> entries) {
        if (entries.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(entries.size());
        return entries.get(randomIndex);
    }
}
