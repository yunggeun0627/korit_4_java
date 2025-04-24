package ch07_loops;

import java.util.Scanner;

/*
    몇 줄의 별을 찍겠습니까? >>> 3
    ***
    **
    *
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몆 줄의 별을 찍겠습니다까>>> ");
        int row = scanner.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = row; j - i > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
