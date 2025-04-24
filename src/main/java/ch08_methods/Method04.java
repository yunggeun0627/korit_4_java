package ch08_methods;

import java.util.Scanner;
/*
    bmi 계산기 method정의
    메서드명  : calculateBmi()
    return type : void
    매개변수 유무 : 없음
 */

public class Method04 {
    public static void calculateBmi() {
        Scanner scanner = new Scanner(System.in);
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String grade = "";
        System.out.println("키를 입력 >>> ");
        height = scanner.nextDouble()/100;
        System.out.println("몸무게를 입력 >>> ");
        weight = scanner.nextDouble();
        bmi = weight/(height*height);

        if(bmi < 18.5) {
            grade = "저체중";
        } else if (bmi < 23) {
            grade = "정상";
        } else if (bmi < 25) {
            grade = "과체중";
        }
        System.out.println("당신의 bmi 지수는 " + bmi + "이고," + grade + "입니다.");
    }

    public static void main(String[] args) {

        calculateBmi();
        /*
            실행 예
            키(cm)를 입력하세요 >>> 172
            몸무게(kg) 입력  >>> 65
            당신의 BMI 지수를 이고, OOO입니다.
         */

    }
}
