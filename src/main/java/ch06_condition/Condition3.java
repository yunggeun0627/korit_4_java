package ch06_condition;

import java.util.Scanner;

/*
    if - else if문 :  if - else문과 달리 else if에는 별도의 조건식이 요구

    형식 :
    if(조건식) {
        실행문1
    } else if(조건식2) {
        실행문2
    } else if(조건식3) {
        실횅문3
    }
 */
public class Condition3 {
    public static void main(String[] args) {
        // Scanner 클래스
        Scanner scanner = new Scanner(System.in);

        // 변수 / 상수의 선언 및 초기화
        int point = 0;
        final  int VIP_POINT = 80;      // final 키워드가 붙으면 재대입x
        final  int GOLD_POINT = 60;     // 즉 변함없는 데이터를 사용
        final int SILVER_POINT = 40;    // 사용하는데, 변함없는 데이터
        final  int BRONZE_POINT = 20;   // 개발자들이 알아보기 위해 대문자

        System.out.println("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        // 조건문
//        if(point > 80) {
//            System.out.println("회원 등급 : VIP");
//        } else if (point > 60) {
//            System.out.println("회원등급 :  GOLD");     // else if 나열해서 BRONZE까지 작성
//        } else if (point > 40) {
//            System.out.println("회원등급 : SILVER");
//        } else if (point > 20) {
//            System.out.println("회원등급 : BRONZE");
//        } else if (point <= 20) {
//            System.out.println("회원등급 : NOMAL");// 맨마지막 else if (point <= 20) 일 때
                                                       // 회원 등급 : NOMAL 로 출력


        // 반복되는 부분이 너무 많다
        // 등급을 저장하는 변수를 하나 선언
        String userGrade = "";      //데이터에 아직 아무런 값이 없습니다
        if (point > 80) {
            userGrade = "VIP";
        } else if (point > 60) {
           userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20) {
           userGrade = "BRONZE";
        } else if (point <= 20) {

        }
            userGrade = "NOMAL";
        System.out.println("회원 등급 : " + userGrade);

        // if - else / if - else if 문의 경우 전체가 한 세트의 조건문
    }
}
