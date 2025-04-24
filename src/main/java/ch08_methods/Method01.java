package ch08_methods;

import java.util.Scanner;

public class Method01 {
    //  method를 정의하는 영역

    // 1. [ x | x ] [ 입력값 | 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2 [ o | x ]
    public static void call2(String strExample) {
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + strExample);
    }

    // 3 [ x | o ]
    public static String call3() {
        System.out.println("[ x | o ]");
        String result = "";                 // 지역변수 - 메서드 내에 정의된 변수
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < i + 1; j++) {
               result += ("*");
            }
            result += "\n"; // \n - 개행하라는 의미 \t -> 공백 두번 / 네 번

        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int date,String day) {
        String result = "";
        System.out.println("[ o | o ]");
        return year + "년" + month + "월" + date + "일" + day + "입니다. 힘네요";
    }

    // 자기 소개를 하는 메서드를 생성
    public static String introduce(String name, int age) {

        return  "제 이름은" + name + "입니다.나이는" + age + "살입니다.\n내년에는" + (age + 1) + "살입니다.";
    }

    public static void main(String[] args) {
        // method를 실행하는 영역
        call1();
        call2("메서드 이해하기");  // 호출 단계에서 () 내를 채우는 것을 argument
//        result = "대입불가";
        call3();    // 실행x
        String hello = "안녕하세요";
        System.out.println(call3());        // call3()는 출력하라는 명령문이 메서드 내에 정의 되어있지 않음
        // 이상을 이유로 sout이 main단계에서 요구됨.
        System.out.println(call4(2024, 4, 24,"목요일"));

        System.out.println(introduce("예영근", 21));
        /*
            Scanner 클래스를 import
            string name / int age를 선언
            name / age에 각각 이름, 나이를 대입
            introduce의 argument 쓴다.
         */
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("이름를 입력 >> ");
        name = scanner.nextLine();
        System.out.println("나이를 입력");
        age = scanner.nextInt();
        String introdution = introduce(name, age);
        System.out.println(introdution);

        /*
            함수형 프로그래밍(Functional Programming) :
            메서드1의 return값이 메서드2의 argument가 되고, 메서드2의;
            return 값이 메서드3의 arugment가 되는 형식

            첫 번 째 메서드로 부터 마지막 메서드까지의 흐름을 통해
            프로그래이 이어지는 방식을 의미

            .nextLine()의 결과값과 .nextInt()의 결과값이
            .
         */
    }
}
