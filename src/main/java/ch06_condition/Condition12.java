package ch06_condition;

import java.util.Scanner;

/*
    Codition07 파일을 확인
    점수를 입려갑당서 등급을 산출
    이를 응용하여 중첩 if 문 + swith문 형태로 프로그램 작성

    지시 사항

    changedScore = 9 ~ 10, grade = A
    changedScore =  8, grade = B
    changedScore = 7, grade = C
    changedScore = 6, grade = D
    changedScore = 4, 3, 2, 1 이면 grade = F

     실행 예
    점수를 입력하세요 >>> 100
    점수는 100점이고, 학점은 A학점입니다.
    changedScore = score / 10

 */
public class Condition12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 88;
        int changedScore;
        String grade;
        System.out.println("점수를 입력하세요");
        score = scanner.nextInt();
        changedScore = score / 10;

        if (score < 00 || score > 100) {
            grade = "x";
        } else {
            switch (changedScore) {
                case 10, 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";

            }
        }
        System.out.println("점수는" + score + "점이고, 학점은" + grade + "학점입니다.");
    }
}