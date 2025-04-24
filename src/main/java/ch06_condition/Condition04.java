package ch06_condition;
/*
    if - else if - else문
    형식 :
    if(조건식1) {
        실행문1
    } else if (조건식2) {
        실행문2
    } else if (조건식3) {
        실행문3
    } else {
        실행문4
    }
 */

public class Condition04 {
    public static void main(String[] args) {
        int  point = 0;

        String userGrade = "";
        if (point > 80) {
            userGrade = "VIP";
        } else if (point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20) {
            userGrade = "BRONZE";
        } else {
            userGrade = "NOMAL";
        }

        System.out.println("회원 등급 : " + userGrade);
    }
}
