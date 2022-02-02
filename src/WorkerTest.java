import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Nathan", "Burns", "Mr.", 2002, 15.0);
        w2 = new Worker("000002", "Emma", "Burns", "Mrs.", 2005, 16.5);
    }

    @org.junit.jupiter.api.Test
    void setHourlyPayRate() {
        assertEquals(15.0, w1.getHourlyPayRate());
        assertEquals(16.5, w2.getHourlyPayRate());
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        assertEquals(150.0, w1.calculateWeeklyPay(10.0));
        assertEquals(833.25, w2.calculateWeeklyPay(47.0));
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        assertEquals("you worked " + 13.0 + "hours this week of regular pay and earned $" + 195.0 + ". You did not work any overtime hours", w1.displayWeeklyPay(13.0));
        assertEquals("you worked " + 40.0 + " hours this week of regular pay and earned $" + 660.0 + ". You also worked " + 7.0 + " hours this week of overtime pay and earned $" + 173.25 + ". Your total combined pay was " + 833.25, w2.displayWeeklyPay(47));
    }
}