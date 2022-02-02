public class Worker extends Person{
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, double hourlyPayRate) {
        super(person.getID(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                " hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    public double calculateWeeklyPay(double hoursWorked){
        if (hoursWorked < 0){
            return 0.0;
        }
        else if (hoursWorked <= 40){
            return hoursWorked * hourlyPayRate;
        }
        else {
            double normalHours = 40.0;
            double overtimeHours = hoursWorked - 40.0;
            double normalPay = normalHours * hourlyPayRate;
            double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            return normalPay + overtimePay;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        if (hoursWorked < 0) {
            return "Not a valid number";
        } else if (hoursWorked <= 40) {
            double normalHours = hoursWorked;
            double normalPay = normalHours * hourlyPayRate;
            return "you worked " + normalHours + "hours this week of regular pay and earned $" + normalPay + ". You did not work any overtime hours";
        } else {
            double normalHours = 40.0;
            double overtimeHours = hoursWorked - 40.0;
            double normalPay = normalHours * hourlyPayRate;
            double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            return "you worked " + normalHours + " hours this week of regular pay and earned $" + normalPay + ". You also worked " + overtimeHours + " hours this week of overtime pay and earned $" + overtimePay + ". Your total combined pay was " + (normalPay + overtimePay);
        }
    }
}