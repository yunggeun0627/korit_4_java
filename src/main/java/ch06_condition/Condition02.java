package ch06_condition;
/*
    if - else문 : if 다음에 있는 조건식이 true일 떄는 if문 내의 {} 실행문이 실행
        / false 경우에는 else에 딸린 {} 실행문이 실행

        형식 :
        if(조건식) {
            실행문1
        } else {            else의 경우 if 가 false 일때만 실행
            실행문2           if에서만 조건이 존재X
        }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if(num1 > 0) {
            System.out.println("num1은 양수입니다.");
        } else {
            System.out.println("num1은 0이거나 음수입니다.");
        }
    }
}
