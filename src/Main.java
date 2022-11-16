import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Anropa metod för input och output exempel
        //inputOutput();

        //Skapa objekt av klassen Person
        Person p1 = new Person("Marcus", "Henriksson", 34);
        new Person("Niklas", "Cullberg", 32);
        new Person("Cihan", "Yasar", 48);

        System.out.println("Ditt namn är "+ p1.firstName);

        for (Person person : Person.persons){
            person.birthday();
        }
    }

    //Ny statisk metod
    public static void inputOutput() {
        System.out.println("Hello world!");

        int count = 10;
        count += 5;

        System.out.println(count);

        //Kommentar.
        //Hämta data från användare

        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in ditt namn: ");
        String input = scan.nextLine();

        System.out.println("Ditt namn är " + input);

        //FOr loop
        for (int i =0; i<5; i++) {
            System.out.println(i+1);

            //If sats
            if (i == 3) {
                int y = 4;
                System.out.println(i*y);
            } else {
                System.out.println("I är inte lika med 3");
            }

            //LOcal scope = Variabel Y finns inte här
            //i += y;
        }
    }
}