package ch09_classes;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();
        // 이상에서 볼수 있듯이
        // Scanner 클래스를 import
        // Scanner 클래스의 인스턴스를 생성하고 있다.

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        // 객체의 속성 접근 방법
        // 객체명.속성명
        classA1.num = 100;
        classA1.name = "김일";

        // classA2 객체를 생성하고,
        // num에 200;
        // name에 김이를 대입하신 후
        // sout을 적용
        // 김이의 번호는 200번
        // 출력
        // 클래스명.속성명은 변수처럼 사용

        ClassA classA2 = new ClassA();
        classA2.num = 200;
        classA2.name = "김이";
        System.out.println(classA2.name + "의 번호는 " + classA2.num + "입니다.");

        // 메서드 호출 방법 ->
        // 객체명.메서드명

        classA1.callName();
        classA2.callName();
        // 이상의 두 method 호출 결과
        // 서로 '다르다'고 말해야 한다.

        /*
            Scanner의 인스턴스를 생성
            ClassA의 인스턴스인 classA3를 생성
            다음과 같이 실행될 수 있다

            이름을 입력 >> 김삼
            번호를 입력 >> 20250003
            점수 입력 >> 4.5  -> Field 정의

            그리고 call() 유형으로
            displayProfile()을 호출
            classA3.displayProfile()을 호출
             [ 실행 결과 ]
            20250003 학번의 학생의 이름은 김삼이고, 4.5점입니다.
            가 출력될 수 있도록 작성하시오.
         */
        Scanner scanner = new Scanner(System.in);
        ClassA classA3 = new ClassA();
        System.out.print("이름을 입력 >>> ");
        classA3.name = scanner.nextLine();
        System.out.print("번호를 입력 >>> ");
        classA3.num = scanner.nextInt();
        System.out.print("점수를 입력 >>> ");
        classA3.score = scanner.nextDouble();

        classA3.displayProfile();

    }
}
