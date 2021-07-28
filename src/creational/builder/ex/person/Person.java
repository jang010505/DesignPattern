package creational.builder.ex.person;

public class Person {
    private final String name;
    private final String age;
    private final String sex;
    private final String phoneNumber;
    private final String address;
    private final String job;

    public Person(String name, String age, String sex, String phoneNumber, String address, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", address=" + address + ", job=" + job + "]";
    }
}