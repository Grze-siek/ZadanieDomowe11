package poprawneosoby;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;

        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();
        if(firstName == null || lastName == null || firstNameLength < 2 || lastNameLength < 2)
            throw new NameUndefinedException("Napis jest nullem lub ma mniej niz dwa znaki");

        if(age < 1)
            throw new IncorrectAgeException("Podany wiek jest za mały!");
    }


    @Override
    public String toString() {
        return "Person{" +
                "Imie ='" + firstName + '\'' +
                ", nazwisko ='" + lastName + '\'' +
                ", wiek=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
