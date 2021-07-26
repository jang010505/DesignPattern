## Singleton Pattern

클래스의 인스턴스가 하나임을 보장하고 접근할 수 있는 전역적인 접근점을 제공하는 패턴으로, 디자인 패턴의 가장 많이 알려진 패턴

### 싱글톤 패턴의 장점
1. 메모리 낭비를 방지할 수 있다.

2. 싱글톤으로 만들어진 클래스와 다른 클래스의 인스턴스들의 데이터 공유가 쉽다.

3. 인스턴스가 절대적으로 한개만 존재하는 것을 보증하기에 개발 시 실수를 줄일 수 있다.

4. 싱글톤 객체를 사용하지 않는 경우 인스턴스를 생성하지 않는다.

5. 싱글톤을 상속시킬 수 있다.

### 싱글톤 패턴의 단점
1. 전역변수보다 사용하기가 불편하다.

2. 싱글톤의 역할이 커질수록 결합도가 높아져 객체 지향 설계 원칙에 어긋날 수 있다.

3. 멀티쓰레드 환경에서 컨트롤이 어렵다.

4. 객체의 파괴 시점을 컨트롤하기 어려울 수 있다.

### Ex Code
code 1
```java
public class Singleton {

    private static Singleton instance = new Singleton();
	
    private Singleton() {}
	
    public static Singleton getInstance() {
        return instance;
    }
}

```

문제점 : 프로그램 실행 시, 전역에서의 싱글톤 클래스의 생성은 알 수 없으므로 해당 단계에서 해당 싱글톤 클래스와 다른 클래스 또는 함수에서 싱글톤 클래스를 참조하고자 하면 문제가 생길 수 있습니다.
<br/><br/><br/>
code 2
```java
public class Singleton {

    private static Singleton instance;
	
    private Singleton () {}
	
    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }    
        
        return instance;
    }
}
```

문제점 : 두 스레드가 동시에 싱글톤 인스턴스에 접근하고 생성이 안된 것을 확인하여 생성한다면 중복으로 생성할 수 있다는 문제가 있을 수 있습니다.
<br/><br/><br/>
code 3
```java
public class Singleton {

    private static Singleton instance;

    private Singleton () {} //생성자를 private로

    public static Singleton getInstance() {
        if (instance == null) {
            //synchroized를 활용하여 여러 인스턴스를 생성하는 것을 방지
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
```