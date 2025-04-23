package ch06_condition;

import java.util.Scanner;
/*
    사용자에게  score 를 입력받아 다음과 같은 조건을 만족
    score 90점 이상이라면 grade 는 A
    score 80점 이상이라면 grade 는 B
    70 점이라면 grade 는 C
    60 점이라면 grade 는 D
    59 이하라면 grade 는 F
 */
public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;

        System.out.println("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        if(score > 89) {
            grade = "A";
        } else if(score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
