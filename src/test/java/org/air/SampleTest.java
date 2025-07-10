package org.air;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SampleTest {

    @Test
    public void additionTest() {
        int result = 2 + 3;
        assertEquals(result, 5);
    }
}
