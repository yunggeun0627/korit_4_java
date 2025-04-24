package ch07_loops;

import java.util.Scanner;

/*
     for (int i = 0; i < 0; i++) {
            반복실행문1-a
      for(int j = 0; i < n; j++) {
        반복실행문2
      }
      (반복실행문1-b)
      for(int k = 0; k < n; k++) {
            반복실행문3
      }
      (반복실행문1-c)
      }
 */
public class Loop06 {
    public static void main(String[] args) {
//       for(int i = 0; i < 6; i++) {
//           for(int j = 0; j < i; j++) {
//                System.out.print("*");              // 별이 한번에 여러 번 찍힐 수 있기 때문에 print
//            }
//           System.out.println();                   // 개행이 일어나는 1차 for문

//           Scanner scanner = new Scanner(System.in);
//           System.out.println("몇 줄을 별찍기를 실행하겠습니다? >>>");
//           int row = scanner.nextInt();

           // 이상의 row 변수를 활용
           // 실행 예
           // 몇 줄의 별찍기를 실행
//            for(int i = 0; i < row + 1; i++) {      // 1차 for문은 개행의 숫자관련있음
//                for(int j = 0; j < i; j++) {        // 2차 for문의 경우에는 별이 찍히는 횟수 관련있음
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
            for(int i = 5; i > 0; i--) {
                for(int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 0; i < 5; i++) {
                for(int j =5; j - i > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
