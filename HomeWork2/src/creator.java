import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class creator {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        Person[] persons = new Person[5];

        persons[0] = new Person ();
        persons[0].Input(bf);

        persons[1] = new Person ("Gektor","Bulba",1994);


        persons[2] = new Person("Jason","Stathem",1993);

        persons[3] = new Person("Asterix", "Voyuda",1999);

        persons[4] = new Person("Asterix", "Voyuda",1990);

        


        for (int i = 0; i < persons.length; i++) {
            persons[i].outPut();
        }

    }

}

