package ch09_classes.students;
/*
    1. student 클래스의 필드를 정의
    1) int studentCode
    2) String name
    3) double score

    2. 기본생성자를 정의. 객체를 생성
        "기본생성자로 객체가 생성되었습니다"라고 출력

    3. int 매개변수를 가지는 매개변수 생성자를 정의 하고
        "int 매개변수 생성자로 객체가 생성되었습니다"

    4. String 매개변수를 가지는 매개변수 생성자를 정의 하고
        "String 매개변수 생성자로 객체가 생성되었습니다"

    5. studentCode / name 매개변수를 가지는 매개변수 생성자를 정의 하고
        "학번 / 이름 매개변수 생성자로 객체가 생성되었습니다"

         6. studentCode / name / score를 매개변수로 하는 생성자를 정의하고
        "학번 / 이름 / 점수를 등록한 학생 객체가 생성되었습니다."라고 출력

    7. StudentMain 클래스에서, 이하의 객체명과 속성을 가질 수 있도록 작성
        1) student1 2025001 / 김일 / 4.5  -> 기본 생성자
        2) student2 2025002 / 김이 / 100 -> int 매개변수 생성자
        3) student3 2025003 / 김삼 / 95.8 -> String 매개변수 생성자
        4) student4 2025004 / 김사 / 4.0 -> int, String 매개변수 생성자
        5) student5 2025005 / 김오 / 80.7 -> int, String, double 매개변수 생성자

    8. 학생의 정보가 출력될 수 있도록 하는 showInfo() 메서드를 call1() 유형으로 작성

    9. 실행 예(콘솔창에 찍히는 부분)
        기본 생성자로 객체가 생성되었습니다.
        int 매개변수 생성자로 객체가 생성되었습니다.
        String 매개변수 생성자로 객체가 생성되었습니다.
        학번과 이름으로 학생 객체가 생성되었습니다.
        학번 / 이름 / 점수를 등록한 학생 객체가 생성되었습니다.

        김일 학생의 정보입니다
        학번 : 2025001
        이름 : 김일
        점수 : 4.5

        김이 학생의 정보입니다
        ...
 */
public class Students {
    int studentCode;
    String name;
    double score;

    Students() {
        System.out.println("기본생성자로 객체가 생성되었습니다");
    }
    Students(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다");
    }
    Students(String name) {
        this.name = name;
        System.out.println( "String 매개변수 생성자로 객체가 생성되었습니다");
    }
    Students(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("학번 / 이름 매개변수 생성자로 객체가 생성되었습니다");
    }
    Students(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("학번 / 이름 / 점수를 등록한 학생 객체가 생성되었습니다.");
    }

    void showInfo() {
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }
}
