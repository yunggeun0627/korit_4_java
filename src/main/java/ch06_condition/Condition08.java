package ch06_condition;

import java.util.Scanner;

/*
    과제:
    윤년 계산기 작성
    윤년(leap year)은 특정 조건을 만족하는 년을 의미

    윤년을 판단하는 규칙
    1. 연도가 4로 나뉘어 떨어지는 해는 윤년에 해당할 수도 있음
    2. 그러나 100 으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 100으로 나누어 떨어지긴 하는데 400으로도 나누어 떨어지는 윤년에 해당

    예를 들어,
    2020년은 4로 나누어 떨어지므로 윤년입니다(100으로 나누어떨어지지 않습니다)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로 나누어 떨어지지 않습니다)
    2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당합니다.

 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.println("연도를 입력하세요");
        year = scanner.nextInt();
        // 입력 받은 year가 윤년에 해당하는지 판단하는지 조건문
//        if (year % 400 == 0) {
//            System.out.println("윤년이 입니다.");
//        } else if (year % 100 == 0) {
//            System.out.println("윤년이 아닙니다.");
//        } else if (year % 4 == 0) {
//            System.out.println("윤년이 입니다.");
//        } else {
//            System.out.println("윤년이 아닙니다.");
//        }
        // sout이  또 반복되는 것 같아서 줄일 수 있다
        // (논리연산자 / 삼항연산자)

        // 반복을 줄이기 위한 leap year 변수 선언
        String leapyear = "";
        if (year % 400 == 0) {
            leapyear = "윤년이 입니다.";
        } else if (year % 100 == 0) {
            leapyear = "윤년이 아닙니다.";
        } else if (year % 4 == 0) {
            leapyear = "윤년이 입니다.";
        } else {
        }
        System.out.println(year + "년은" + leapyear);
    }
}
