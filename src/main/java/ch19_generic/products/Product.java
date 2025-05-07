package ch19_generic.products;

import lombok.AllArgsConstructor;
import lombok.ToString;

/*
    1. ProductController.Java를 생성하고, 다양한 타입의
    상품 정보를 저장하고, 출력하는 코드를 작성

    실행 예
        Product(ProductName = Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD) string
        Product(ProductName = Smartphone, productInfo=799.99) Double
        Product(ProductName = Available, productInfo=true) boolean


 */
@AllArgsConstructor
@ToString       // @Date를 달아서 해결하는 방법, alt + ins를 통해 tostring() 메서드를 재정의하는 방법도 있다
public class Product<T> {
    private String productName;
    private T productInfo;




}
