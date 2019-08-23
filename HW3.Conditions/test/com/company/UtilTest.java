package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class UtilTest {

    @Test
    public void isInRange() {
        assertTrue(Util.isInRange(-5));
    }

    @Test
    public void checkFloatNumbersRange() {
        assertTrue(Util.checkFloatNumbersRange(-5, 0, 5));
    }

    @Test
    public void minNumber() {
        assertEquals(99, Util.minNumber(100, 101, 99));
    }

    @Test
    public void maxNumber() {
        assertEquals(1, Util.maxNumber(-1, 0, 1));
    }

    @Test
    public void httpErrorName() {
        assertEquals(HTTPError.UNKNOWN_HTTP_ERROR, Util.httpErrorName(999));
    }

}