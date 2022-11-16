import java.util.ArrayList;

public class Person {

    //Attribut
    public String firstName;
    public String lastName;
    public int age;

    public static int count = 0;
    public static ArrayList<Person> persons = new ArrayList<Person>();

    //Konstruktor
    public Person(String firstName, String lastName, int age){
        //Applicera värden till attribut
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        //Öka Count med +1
        count++;

        //Spara DETTA objekt i statisk lista
        persons.add(this);
    }

    //Birthday Metod
    public void birthday() {
        //Öka ålder med +1
        this.age++;

        //Skriv ut meddelande till konsol
        System.out.println(this.firstName + " är nu " + this.age + " år gammal!");
    }
}
