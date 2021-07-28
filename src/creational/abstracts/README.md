## Abstract Factory Pattern

추상 팩토리 패턴은 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공하는 패턴이다.

추상 팩토리 패턴은 객체의 생성, 표현, 구성과는 무관하게 시스템을 독립적으로 만들고자 할 때 유용한 패턴이다. 여러 클래스들 중에 하나를 선택해서 시스템을 설정해야하고 한번 구성한 제품을 다른것으로 대체할 수 있을 때 사용한다.

### EX

자동차 공장

-> frame<br/>
--> avante frame<br/>
--> sonata frame

-> wheel<br/>
--> avante wheel<br/>
--> sonata wheel

-> avante<br/>
--> avante frame<br/>
--> avante wheel

-> sonata<br/>
--> sonata frame<br/>
--> sonata wheel

-> factory<br/>
--> avante factory<br/>
--> sonata factory