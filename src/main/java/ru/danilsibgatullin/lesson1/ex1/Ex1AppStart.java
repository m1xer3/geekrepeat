package ru.danilsibgatullin.lesson1.ex1;

public class Ex1AppStart {
    public static void main(String[] args) {

        Person person = Person.getPersonBuilder()
                .withFirstName("Lary")
                .withLastName("Jonse")
                .withAge(18)
                .withAddress("Address")
                .build();

        System.out.println(person);

    }
}
