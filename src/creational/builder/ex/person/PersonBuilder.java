package creational.builder.ex.person;

public class PersonBuilder {
    private String name;
    private String age;
    private String sex;
    private String phoneNumber;
    private String address;
    private String job;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setJob(String job) {
        this.job = job;
        return this;
    }

    public Person build() {
        return new Person(name, age, sex, phoneNumber, address, job);
    }
}
