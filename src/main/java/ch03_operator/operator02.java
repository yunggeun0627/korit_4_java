package ch03_operator;
/*
    논리 연산자

    true(1) / false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false를 구분하는 자료함

    AND(&&) : 곱 연산자 T x T = T/T x F = F/ F x F = F -> false이면 false
    OR(||) : 합 연산자 T + T = T/ T + F = T / F + F = F -> 하나라도 true라면 True
    NOT(!) : true값을 false로, fasle을 true로 역전시키는 연산자
 */
public class operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("-------&&연산자");
        boolean result1 = flag1 && flag2;
        System.out.println("T x T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = flag2 && flag1;
        System.out.println("F x F = " + result3);
        boolean result4 = flag1 || flag2;
        System.out.println("T + T = " + result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);


        boolean result7 = (flag1 || flag2) && flag2;
        System.out.println(result7);                    // true

        boolean result8 = flag1 && flag2 && flag2;
        System.out.println(result8);                    // false

        boolean result9 = 10 % 3 == 0;
        System.out.println("10 / 3 연산의 나머지는 0이다? : " + result9);

        // ch04_scanner
    }
}
