import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreChecker {

    @Test
    public void shouldBeWorthless() {
        assertEquals(0, Greed.greedy(new int[]{2, 3, 4, 6, 2}));
    }

    @Test
    public void shouldValueTriplets() {
        assertEquals(400, Greed.greedy(new int[]{4, 4, 4, 3, 3}));
    }

    @Test
    public void shouldValueMixedSets() {
        assertEquals(450, Greed.greedy(new int[]{2, 4, 4, 5, 4}));
    }
}
