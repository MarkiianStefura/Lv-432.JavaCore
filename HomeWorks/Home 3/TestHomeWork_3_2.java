package edu.com;

import static org.junit.Assert.*;

public class TestHomeWork_3_2 {


    @org.junit.Test
    public void checkRange() {
        int a=3;
        int b=2;
        int c=6;
    assertTrue(((a >= -5 & a <= 5)&(b >= -5 & b <= 5)&(c >= -5 & c <= 5)));
    }

    @org.junit.Test
    public void maxValues() {
        assertEquals(12,Math.max(12,10));
    }

    @org.junit.Test
    public void minValues() {
    assertEquals(15,Math.min(15,10));
    }

    @org.junit.Test
    public void main() {
    }
}