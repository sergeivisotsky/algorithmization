package secondSemester;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThirdCompetitionTest {

    @Test
    public void parseAsTheNumberTest() {
        String number = "222233";
        assertTrue(ThirdCompetition.parseAsTheNumber(number));
    }
}