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
        Person person = null;
        try {
            person = new Person(firstName, lastName, age, pesel);
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(person.toString());
    }
}
