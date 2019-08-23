import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthDay;

    public int getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(int birthDay){
        this.birthDay= birthDay;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

      //simple constructor
    public Person(){}

    //constructor with 3 parameters
    public Person(String firstName,String lastName , int birthDay){
        this.birthDay=birthDay;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getAge(){
        return (2019-birthDay); // так робити не добре, на другий рік наша програма вже буде не актуальна. Треба отримати поточний рік. Подивись до класу LocalDate
    }
    public void output(){
        System.out.println(this.firstName+" "+this.lastName+" " +this.getAge());
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your firstname");
        firstName=sc.nextLine();
        System.out.println("please enter your lastname");
        lastName=sc.nextLine();
        System.out.println("please enter your birthday");
        birthDay=sc.nextInt();
    }
    public void changeName(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
