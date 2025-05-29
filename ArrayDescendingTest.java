import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayDescendingTest{

    @Test
    public void testSortDescending_NormalCase() {
        int[] input = {3, 1, 5, 8, 6, 4};
        int[] expected = {8, 6, 5, 4, 3, 1};
        assertArrayEquals(expected, ArrayDescending.sortDescending(input));
    }

}