package ch18_static.builders;

public class Person {
    private  String name;
    private  int age;
    private String address;

    // 빌더패턴 작성
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private  String name;
        private  int age;
        private String address;

        // 코드에 주목 -> method들을 정의
        // method는 대부분 행위를 나타내기때문에 동사로 작성
        // Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드 명을 씁니다.
        // 예를 들어ㅗ builder.name("안근수"); / builder.age(38); 과 같이 방식이 된다
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 코드는 Person 클래스의 필드와 관련있는 메서드
        // 객체 생성을 완료하는 메서드를 정의 -> 기본적으로 build() 라고 짓습니다.
        public Person build() {
            return new Person(this);
        }
    }
}
