import java.util.*;

public class Line {
    public static int[] generateNumbers() {
        int[] numbers = new int[7];
        Random rand = new Random();
        Set<Integer> chosenNumbers = new HashSet<Integer>();
        while (chosenNumbers.size() < 7) {
            int num = rand.nextInt(41);
            if (!chosenNumbers.contains(num)) {
                chosenNumbers.add(num);
            }
        }
        int i = 0;
        for (int num : chosenNumbers) {
            numbers[i] = num;
            i++;
        }
        Arrays.sort(numbers);
        return numbers;
    }
}
