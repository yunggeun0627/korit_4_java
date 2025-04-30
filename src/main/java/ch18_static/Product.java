package ch18_static;

import lombok.Getter;

@Getter // 클래스레벨에서 @Getter는 static 메서드와 관계X
public class Product {
    // 필드 선언
    // Static 변수 선언 및 초기화

    @Getter         // 필드 레벨에서의 @Getter 예시
    private static int count = 0;

    // 인스턴스 변수 선언
    private int instanceCount = 0;  // 필드에도 초기화 가능

    public Product() {
        System.out.println("Product 클래스의 인스턴스가 생성");
        count++;
        instanceCount++;
    }
}
