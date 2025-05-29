import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueElementsTest {

    @Test
    public void testUniqueElements() {
        string[] input = {1, 2, 3, 2};
        string[] expected = {4};
        assertEquals(expected, UniqueElements.add(input));
    }


    @Test
    public void testUniqueElements() {
        string[] input = {1, 1, 1, 1, 1};
        string[] expected = {0};
        assertEquals(expected, UniqueElements.add(input));
    }

}