package ch23_lambda;

import ch09_classes.Constructor;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello, Java!");
//            }
//        };
//
//// 익명 클래스 정의
//// 메서드 호출
//        runnable.run();
//
//        // ↑  이게 기본 방식
//        Runnable laRunnable = () -> System.out.println("Hello, Java Lambda!");
//        // 코드가 익명 클래스에서 메서드를 오버라이드해서 재정의하는 부분까지 전부 다 입니다.
//        // 메서드 호출
//        laRunnable.run();

        // 1. Supplier -> call2() 유형의 함수형 인터페이스
        Supplier<String> stringSupplier = () -> "Hello, Functional Interface and Lambda!";
        // 2. Consumer -> call3() 유형의 함수형 인터페이스
        Consumer<String> stringConsumer = (message) -> System.out.println("메서지 : " + message);
        // 3. Supplier로부터 값을 생성하고서 Consumer를 통해서 출력
        String message = stringSupplier.get();
        // message 변수에 "Hello, Functional Interface and Lambda!" String 데이터 대입
        stringConsumer.accept(message);
    }
}
