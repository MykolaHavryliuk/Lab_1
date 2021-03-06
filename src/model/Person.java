package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Person {
    public enum Gender{
        male, female, child;
    }
    private String name;
    private String surname;
    private LocalDate birthdate;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthdate = builder.birthdate;
        this.gender = builder.gender;
    }

    public static class Builder{
        private String name;
        private String surname;
        private LocalDate birthdate;
        private Gender gender;

        public Builder(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public Builder setBirthdate(LocalDate birthdate){
            this.birthdate = birthdate;
            return this;
        }


        public Builder setGender(Gender gender){
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                surname.equals(person.surname) &&
                Objects.equals(birthdate, person.birthdate) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthdate, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                '}';
    }
}
