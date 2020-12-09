package model;

import java.util.List;
import java.util.Objects;

public class House {
    private String address;
    private float area;
    private int flours;
    private int year;
    private List<Person> persons;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getFlours() {
        return flours;
    }

    public void setFlours(int flours) {
        this.flours = flours;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    private House(Builder builder){
        this.address = builder.address;
        this.area = builder.area;
        this.flours = builder.flours;
        this.year = builder.year;
        this.persons = builder.persons;
    }

    public static class Builder{
        private String address;
        private Float area;
        private int flours;
        private int year;
        private List<Person> persons;

        public Builder(String address){
            this.address = address;
        }

        public Builder setArea(Float area){
            this.area = area;
            return this;
        }

        public Builder setFlours(int flours){
            this.flours = flours;
            return this;
        }

        public Builder setYear(int year){
            this.year = year;
            return this;
        }


        public Builder setPersons(List<Person> persons){
            this.persons = persons;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Float.compare(house.area, area) == 0 &&
                flours == house.flours &&
                year == house.year &&
                address.equals(house.address) &&
                Objects.equals(persons, house.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, area, flours, year, persons);
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", flours=" + flours +
                ", year=" + year +
                ", persons=" + persons +
                '}';
    }
}
