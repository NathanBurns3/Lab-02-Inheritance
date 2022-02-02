public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(Person person, double hourlyPayRate, double annualSalary) {
        super(person, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                super.toString() +
                "annualSalary=" + annualSalary +
                '}';
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return getAnnualSalary() / 52.0;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return "your weekly pay from you 52 week salary is $" + (getAnnualSalary() / 52.0);
    }
}