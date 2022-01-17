package ru.danilsibgatullin.lesson1.ex1;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private Integer age;
    private String gender;

    private Person() {
    }

    public static PersonBuilder getPersonBuilder(){
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class PersonBuilder {

        private  Person person;

        public PersonBuilder() {
            this.person = new Person();
        }

        public PersonBuilder withFirstName(String param){
            this.person.firstName=param;
            return this;
        }

        public PersonBuilder withLastName(String param){
            this.person.lastName=param;
            return this;
        }

        public PersonBuilder withMiddleName(String param){
            this.person.middleName=param;
            return this;
        }

        public PersonBuilder withCountry(String param){
            this.person.country=param;
            return this;
        }

        public PersonBuilder withAddress(String param){
            this.person.address=param;
            return this;
        }

        public PersonBuilder withPhone(String param){
            this.person.phone=param;
            return this;
        }

        public PersonBuilder withAge(Integer param){
            this.person.age=param;
            return this;
        }

        public PersonBuilder withGender(String param){
            this.person.gender=param;
            return this;
        }

        public Person build(){
            return this.person;
        }

    }



}
