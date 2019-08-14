import static org.junit.Assert.*;

public class Task2Test {

    @org.junit.Test
    public void firstFivePossitive() {
        int[] calc = new int[10];
        calc[0] = 7;
        calc[1] = 12;
        calc[2] = 17;
        calc[3] = 11;
        calc[4] = 5;
        calc[5] = 2;
        calc[6] = 9;
        calc[7] = 13;
        calc[8] = 18;
        calc[9] = 11;

        assertTrue(Task2.firstFivePossitive(calc));
    }

    @org.junit.Test
    public void sumFristFive() {
        int[] calc = new int[10];
        calc[0] = 7;
        calc[1] = 3;
        calc[2] = 1;
        calc[3] = 4;
        calc[4] = 5;
        calc[5] = 2;
        calc[6] = 9;
        calc[7] = 13;
        calc[8] = 13;
        calc[9] = 11;

        assertEquals(20,Task2.sumFristFive(calc));
    }

    @org.junit.Test
    public void productOfLastFive() {
        int[] calc = new int[10];
        calc[0] = 7;
        calc[1] = 3;
        calc[2] = 1;
        calc[3] = 4;
        calc[4] = 5;
        calc[5] = 2;
        calc[6] = 9;
        calc[7] = 0;
        calc[8] = 18;
        calc[9] = 11;

        assertEquals(0,Task2.productOfLastFive(calc));
    }
}