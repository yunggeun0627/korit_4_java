package ch19_generic.products;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 = new Product("Laptop", "Intel_i7, 16GB RAM, 512GB SSD");
        Product<String> product2 = new Product("Smartphone", 799.99);
        Product<String> product3 = new Product("Available", true);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
