import java.util.Arrays;

public class ArrayDescending {
    public static int[] sortDescending(int[] numbers) {
        int[] sorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sorted);
        return sorted;
    }
}