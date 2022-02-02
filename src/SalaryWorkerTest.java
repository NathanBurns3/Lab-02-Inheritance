import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1, s2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000001", "Nathan", "Burns", "Mr.", 2002, 15.0, 31200.0);
        s2 = new SalaryWorker("000002", "Emma", "Burns", "Mrs.", 2005, 16.5, 39000.0);
    }

    @org.junit.jupiter.api.Test
    void setAnnualSalary() {
        assertEquals(31200.0, s1.getAnnualSalary());
        assertEquals(39000.0, s2.getAnnualSalary());
    }


    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        assertEquals(600.0, s1.calculateWeeklyPay(39.0));
        assertEquals(750.0, s2.calculateWeeklyPay(39.0));
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        assertEquals("your weekly pay from you 52 week salary is $600.0", s1.displayWeeklyPay(39.0));
        assertEquals("your weekly pay from you 52 week salary is $750.0", s2.displayWeeklyPay(39.0));
    }
}