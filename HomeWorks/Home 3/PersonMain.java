public class PersonMain {
    public static  void main (String []args){
        Person person1 = new Person();
        Person person2 = new Person("Pagani","Zonda",1978);
        Person person3 = new Person("Mazeratti","Quattroporte",1999);
        Person person4 = new Person("Black","Jack",1625);
        Person person5 = new Person();
        person1.setBirthDay(2000);
        person1.setFirstName("Alex");
        person1.setLastName("Music");
        System.out.println("First person is : ");
        person1.output();
        System.out.println("Second person is : ");
        person2.output();
        System.out.println("Third person is : ");
        person3.output();
        System.out.println("Fourth person is : ");
        person4.output();
        System.out.println("Fourth person after little operation is : ");
        person4.changeName("Martini","Bianco");
        person4.output();
        System.out.println("Fifth person is : ");
        person5.input();
        person5.output();

    }
}
