/*
    - Benjamin Van Cise
    - 6-21-2022
    - CS 410 @ Bellevue College
    - Final
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @BeforeEach
    public void setUp() {
        StringCalculator stringAdder = new StringCalculator();
    }


    @AfterEach
    public void tearDown() {
        StringCalculator stringAdder = null;
    }

    @Test
    public void testNegative() throws Exception {
        String ints = "1, 3, -1";

        try {
            StringCalculator.add(ints);
        }
        catch (Exception e) {
            assert e.getMessage().equals("negatives not allowed.");
        }


    }

    @Test
    public void testLarge() throws Exception {
        String ints = "1, 3, 1001";
        int x = StringCalculator.add(ints);
        assertEquals(4, x);
    }


}
