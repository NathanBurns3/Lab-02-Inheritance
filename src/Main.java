import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Worker w1 = new Worker("000001", "Nathan", "Burns", "Mr.", 2002, 15.0);
        Worker w2 = new Worker("000002", "Emma", "Burns", "Mrs.", 2005, 16.5);
        Worker w3 = new Worker("000003", "Aubrey", "James", "Mrs.", 2008, 14.5);

        SalaryWorker s1 = new SalaryWorker("000004", "Jackson", "Kordos", "Mr.", 2002, 15.5, 26000.0);
        SalaryWorker s2 = new SalaryWorker("000005", "Alex", "Johnson", "Mr.", 1997, 16.0, 33800.0);
        SalaryWorker s3 = new SalaryWorker("000006", "Sally", "Stratman", "Mrs.", 1975, 20.5, 41600.0);

        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        workers.add(s1);
        workers.add(s2);
        workers.add(s3);

        System.out.println("Week 1");
        System.out.printf("%-25s%-15s\n", "Name", "Weekly Pay");
        System.out.println("====================================");
        for(Worker x : workers) {
            System.out.printf("%-25s", x.fullName());
            System.out.printf("%-15s\n", x.calculateWeeklyPay(40.0));
        }

        System.out.println("\n\n");

        System.out.println("Week 2");
        System.out.printf("%-25s%-15s\n", "Name", "Weekly Pay");
        System.out.println("====================================");
        for(Worker x : workers) {
            System.out.printf("%-25s", x.fullName());
            System.out.printf("%-15s\n", x.calculateWeeklyPay(50.0));
        }

        System.out.println("\n\n");

        System.out.println("Week 3");
        System.out.printf("%-25s%-15s\n", "Name", "Weekly Pay");
        System.out.println("====================================");
        for(Worker x : workers) {
            System.out.printf("%-25s", x.fullName());
            System.out.printf("%-15s\n", x.calculateWeeklyPay(40.0));
        }
    }
}
