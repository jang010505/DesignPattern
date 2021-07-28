## Builder Pattren

복잡한 객체의 생성 과정과 표현 방법을 분리하여 동일산 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴이다.

### EX
code 1
```java
class Person {
    private String name;
    private String age;
    private String sex;
    private String phoneNumber;
    private String address;
    private String job;
    
    public Person(String name) {
        this(name, "");
    }
    
    public Person(String name, String age) {
        this(name, age, "");
    }
    
    public Person(String name, String age, String sex) {
        this(name, age, sex, "");
    }
    
    public Person(String name, String age, String sex, String phoneNumber) {
        this(name, age, sex, phoneNumber, "");
    }
    
    public Person(String name, String age, String sex, String phoneNumber, String address) {
        this(name, age, sex, phoneNumber, address, "");
    }
    
    public Person(String name, String age, String sex, String phoneNumber, String address, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }
}
```

아래 사람의 정보가 있다. 사람 정보에는 이름, 나이, 성별, 핸드폰번호, 주소, 직업 등등이 있는데 객체를 생성할 때 인자의 값을 잘못 주게 된다면 잘못된 정보가 저장될 수 있다. 예를 들어 이름이 들어갈 파라미터에 나이가 들어갈 수가 있다. 또한 가독성도 좋지 않다.


code2

```java
class Person {
    private String name;
    private String age;
    private String sex;
    private String phoneNumber;
    private String address;
    private String job;
    
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

class PersonBuilder {
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
        Person person = new Person(name, age, sex, phoneNumber, address, job);
        
        return person;
    }
}
```

빌더 패턴을 적용해보니 엄청나게 깔끔해졌다. 불필요한 생성자를 만들지 않고 깔끔하게 객체를 만들 수 있으며 데이터 순서와 상관 없이 객체를 만들 수 있고, 생성자 필드를 보거나, JavaDoc을 볼 필요 없이 직관적이고 명시적인 setter 메서드 이름으로 데이터를 추가하여 객체를 만들 수 있다.