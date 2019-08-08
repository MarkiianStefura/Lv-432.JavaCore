package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void isInRange() {
        assertTrue(Util.isInRange(-5));
    }

    @Test
    void checkFloatNumbersRange() {
        assertTrue(Util.checkFloatNumbersRange(-5,0,5));
    }

    @Test
    void minNumber() {
        assertEquals(99,Util.minNumber(100,101,99));
    }

    @Test
    void maxNumber() {
        assertEquals(1,Util.maxNumber(-1,0,1));
    }

    @Test
    void httpErrorName() {
        assertEquals(HTTPError.UNKNOWN_HTTP_ERROR,Util.httpErrorName(999));
    }
}