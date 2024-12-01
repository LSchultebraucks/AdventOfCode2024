import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day1Test {

    private Day1 day1;

    @BeforeEach
     void init() {
        day1 = new Day1();
    }

    @Test
    void testPart1() {
        int result = day1.part1();
        Assertions.assertEquals(2176849, result);
    }

    @Test
    void testPart2() {
        int result = day1.part2();
        Assertions.assertEquals(23384288, result);
    }
}

