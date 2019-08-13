package com.company;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void checkThree() {
        assertTrue(Main.CheckThree(1f,2f,3f));
    }

    @org.junit.Test
    public void checkRange() {
        assertTrue(Main.CheckRange(1f));
    }
}