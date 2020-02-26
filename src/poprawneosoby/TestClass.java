package poprawneosoby;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String pesel = scanner.nextLine();
        createPerson(firstName, lastName, age, pesel);
        scanner.close();

    }
    public static Person createPerson(String firstName, String lastName, int age, String pesel) {
        Person person = null;
        try {
            person = new Person(firstName, lastName, age, pesel);
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
        if (person != null) {
            System.out.println(person.toString());
        }
        return person;
    }
}
