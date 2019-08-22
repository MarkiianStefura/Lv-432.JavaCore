package ua.com.softserve.task.task2;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Marta");
        employee1.setRate(7);
        employee1.setRate(9);
        employee1.setHours(17);

        Employee employee2 = new Employee("Ivan", 10, 8);

        Employee employee3 = new Employee("Taras", 8);
        employee3.setHours(20);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);



        System.out.println(Employee.getTotalSum());
    }
}
