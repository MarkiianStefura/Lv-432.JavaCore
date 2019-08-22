package ua.com.softserve.task.task2;

public class Employee {

    public static double totalSum;
    public static double salary;
    public static double bonus;


    private String name;
    private int rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getBonuses() + getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;

    }

    public void setRate(int rate) {
        totalSum = totalSum - getBonuses() - getSalary();

        this.rate = rate;
        totalSum = totalSum + getBonuses() + getSalary();

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum = totalSum - getBonuses() - getSalary();

        this.hours = hours;
        totalSum = totalSum + getBonuses() + getSalary();

    }

    public int getSalary() {
        return hours*rate;

    }
    public double getBonuses() {
        return getSalary()*0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary =" + getSalary() +
                ", bonus = " + getBonuses() +
                ", sum = " + (getSalary() + getBonuses()) +
                '}';
    }

        public static double getTotalSum() {
        return totalSum;

    }


}
