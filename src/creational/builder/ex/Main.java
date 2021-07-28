package creational.builder.ex;

import creational.builder.ex.person.Person;
import creational.builder.ex.person.PersonBuilder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person ktko = personBuilder.setName("ktko").setAge("30").setSex("Male").setJob("Programmer").setAddress("Seoul").build();
        System.out.println(ktko.toString()); //Person [name=ktko, age=30, sex=Male, phoneNumber=null, address=Seoul, job=Programmer]

        Person yjs = personBuilder.setName("yjs").setAge("30").setSex("FeMale").setJob("Designer").build();
        System.out.println(yjs.toString()); //Person [name=yjs, age=30, sex=FeMale, phoneNumber=null, address=null, job=Designer]
    }
}
