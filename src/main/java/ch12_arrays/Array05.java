package ch12_arrays;
/*
     String[] scores = { "A", "B", "C", "D", "F" };
    를 선언하고 반복문을 작성해서
    scores 배열의 결과가 { "A+", "B+", "C+", "D+", "F+" }
    가 되도록 한 후,
    실행 예
    점수 : A+ B+ C+ D+ F+
    가 되도록 코드를 작성하시오.
    main에서만 쓰시면 됩니다.
 */
public class Array05 {
    public static void main(String[] args) {
        String[] socres = {"A", "B", "C", "D", "F"};
        for(int i = 0; i < socres.length - 1; i++) {
            socres[i] += "+";
            System.out.print(socres[i] + "/");
        }
    }
}
