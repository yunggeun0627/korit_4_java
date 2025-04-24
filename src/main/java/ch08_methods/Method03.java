package ch08_methods;

import java.util.Scanner;

public class Method03 {
    public static void main(String[] args) {
        /*
            실행 예
            몇 과목의 점수를 입력
            1. 과목의 점수를 입력 >> 100
            2. 과목의 점수 >> 90
            3. 괴목의 점수 >> 95
            총합으 285.0이며. 평균으 95.0
         */

        calculateAvgScore();
    }
    public static void calculateAvgScore() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avgScore = 0;
        int numOfSubs = 0;
        System.out.println("몇 과목의 점수입력 >>> ");
        numOfSubs = scanner.nextInt();
        for(int i = 0; i < numOfSubs; i++) {
            System.out.print((i+1) + "과목의 점수를 입력 >>> ");
            sum += scanner.nextDouble();
        }
        avgScore = sum /numOfSubs;
        System.out.println("총합은" + sum + "점이며,평균은" + avgScore + "점입니다.");
    }
}
