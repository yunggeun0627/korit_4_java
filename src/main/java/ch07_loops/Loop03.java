package ch07_loops;
/*
    while문을 사용하여

    1 2 3 4 5 6 7 8 9 10
    11 12  13 14 15 16 17 18 19 20
    ... 100
 */
public class Loop03 {
    public static void main(String[] args) {
        int i = 1;
        while(i < 101) {
            System.out.print(i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
        // # 2 반복문 10번 돌리는 법
        int i2 = 1;
        while(i2 < 101) {
            System.out.println(i2 + " " + (i2 + 1) + " " + (i2 + 2) + " " + (i2 + 3) + " " +
                    (i2 + 4) + " " + (i2 + 5) + " " + (i2 + 6) + " "  +(i2 + 7) + " " +
                    (i2 + 8) + " " + (i2 + 9) + " " );
            i2 += 10;
        }
    }
}
