package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
    // 객체 생성
    Person person1 = new Person();

    person1.setName("김일");
    person1.setAge(243);
    person1.setAge(21);

    int strLeagth = "안녕하세요".length();
        System.out.println(strLeagth);

    // 객체 생성
    Person person2 = new Person("이이",32);
    // # 1 객체명.속성명
//    person2.name = "강이";  //Person.java private 적용하면 오류발생
    // # 2 SetName()을 이용하는 방법
    person2.setName("최이");

    // # 1
//        System.out.println(person2);  //Person.java private 적용하면 오류발생
    // # 2. getName() -> call3()
        System.out.println(person2.getName());

        person2.getName2();

        // call() / call2() 유형의 경우 return이 없는 대신 콘솔창 출력을 하기위해서는
        // 메서드 내에 sout()을 구현할 필요가 있다
        // 이상의 경우 main 단계에서 메서드 호출을 하기만 하면 콘솔창에 결과가 출력된디는 장점있지만
        // '데이터의 가공'이 어렵다.

        // 김일 님 반갑습니다 / 최일 님 반갑습니다.
        System.out.println(person1.getName() + "님 반갑습니다.");
        System.out.println(person2.getName() + "님 반갑습니다.");

        person1.getName2();
        person2.getName2();
    }
}
