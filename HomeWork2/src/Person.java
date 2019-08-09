import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName,int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;

    }

    public String getFitstName() {
        return firstName;
    }

    public void setFitstName(String fitstName) {
        this.firstName = fitstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", age='" + getAge() + '\'' +
                '}';
    }

    public int getAge() {
        return birthYear == 0 ? 0 : LocalDate.now().getYear() - birthYear;
    }

    public void Input(BufferedReader br) throws IOException {
        System.out.println("Enter person name ");
        firstName = br.readLine();
        System.out.println("Enter person lastName ");
        lastName = br.readLine();
        System.out.println("Enter person birth year ");
        birthYear = Integer.parseInt(br.readLine());
    }

    public void outPut() {
        System.out.println(this.toString());
    }

    public void changeName(String fn, String ln) {
        setFitstName(fn);
        setLastName(ln);


    }

}
