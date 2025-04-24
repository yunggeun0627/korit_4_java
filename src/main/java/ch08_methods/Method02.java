package ch08_methods;

import java.util.Scanner;

public class Method02 {
    // 한 방에 자기 소개하는 메서드 정의

    public static void intruduce() {
        // 내부에서 Scanner import
       Scanner scanner = new Scanner(System.in);
       System.out.print("이름을 입력 >> ");
       String name = scanner.nextLine();
        System.out.print("주소를 입력 >> ");
        String address = scanner.nextLine();
       System.out.println("제 이름은" + name + "입니다.");
        System.out.println(address + "에 살고 있습니다.");
    }

    /*
        출석부를 출력
        메서드 명 : registerStudent()
        return : void

        실행 예
        학번을 입력 >>>>
        이름을 입력 >>>>

        라고 출력되는 메서드 정의

        main 단계에서 학생 수를 입력
        실행 예

     */
    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학번을 입력 >>> ");
        int studentCode = scanner.nextInt();
        System.out.println("이름을 입력 >>> ");
        String name = scanner.next();
        System.out.println("학번은 : " + studentCode);
        System.out.println("이름은 : " + name);
    }

    public static void registerStudent2(int count) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < count; i++) {
            System.out.println("학번을 입력 >>> ");
            int studentCode = scanner.nextInt();
            System.out.println("이름을 입력 >>> ");
            String name = scanner.next();
            System.out.println("학번은 : " + studentCode);
            System.out.println("이름은 : " + name);
        }
    }

    public static void registerStudent3(int count) {
        for(int i = 0; i < count; i++) {
            registerStudent();      // 메서드 내에 메서드를 호출하는 것이 가능  -> 재사용성의 예
        }
    }

    public static void main(String[] args) {
        //호출
//        intruduce();
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 명의 학생을 등록하시겠습니까? >>> ");
        int studentNum = scanner.nextInt();

        // call2() 유형으로 registerStudent2() 정의
       registerStudent2(studentNum);     // studentNum이라는 argument가
        // method 정의 시에 for / while문의 한계값으로 사용


        // for를 사용
//        for (int i = 0; i < studentNum; i++) {
//            registerStudent();
//        }

       // while를 사용
//        int num = 0;
//        while (num < studentNum) {
//            registerStudent();
//            num++;
//        }
    }
}

