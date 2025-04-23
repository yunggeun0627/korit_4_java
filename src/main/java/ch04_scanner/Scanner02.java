package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            .next() : String 데이터를 받을 떄 띄어쓰기를 인정X
            .nextLine() : String 데이터를 받을 때 띄어쓰기 인정하고 enter키 기준으로 데이터가 입력됨

            실행 예
            이름 입력 >>> 이름
            나이를 입력 >>> 나이
            주소를 입력 >>> 주소

            안녕하세요. 제 이름은입니다. 주소에 살고 있습니다.
            10년 후 나이는 + 10입니다.
         */
       //Scaner클래스 import
        //변수 선언 입력
        //프롬프트 입력
        Scanner scanner = new Scanner(System.in);
        String name;
        String address;
        int age;
        int age10;

        System.out.print("이름 입력 >>>");
        name = scanner.next();
        System.out.print("나이를 입력 >>>> ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주소를 입력 >>> ");
        address = scanner.nextLine();
//        int age10 = age + 10;
        age10 = age + 10;

        System.out.println("안녕하세요,  제 이름은 " + name + "입니다." +  address + "에 살고있습니다.");
        System.out.println("10년 후 나이는 " + age10 + "살입니다.");

    }
}
