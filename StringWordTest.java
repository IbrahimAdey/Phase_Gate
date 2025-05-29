import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringWordTest {

    @Test
    public void testStringWord() {
        string[] input = {a, b, c, d, e, f, d};
        string[] expected = {d, c, b, a, e, f, d};
        assertEquals(expected, testStringWord.add(input));
    }


    @Test
    public void testStringWord() {
        string[] input = {g, h, i, j, k};
        string[] expected = {j, i, h, g, k};
        assertEquals(expected, testStringWord.add(input));
    }

}