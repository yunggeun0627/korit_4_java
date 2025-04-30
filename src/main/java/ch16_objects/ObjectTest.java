package ch16_objects;

import java.util.Scanner;

/*
       필드를 전부 private으로 선언하시오
    String name;
    String address;

    기본생성자, 매개변수 생성자(하나짜리 두개 두개짜리 하나) 생성하시오
    ex) 기본 생성자로 객체가 생성되었습니다.
        name 매개변수로 객체가 생성되었습니다.
        name, address 매개변수로 객체가 생성되었습니다. 출력시킬 것

    getter / setter를 정의하시오.

    displayInfo() 메서드를 call1() 유형으로 정의하시오.
    ex)
    이름 : 어쩌고
    주소 : 어쩌고 저쩌고

    ObjectTestMain에서 ObjectTest의 객체를 생성하고 이름에 여러분이름, 주소에 여러분 주소를
    입력하고 displayInfo()를 호출하시오.
 */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //    public ObjectTest(String address) {
//        this.address = address;
//    }

    /*
        코드가 오류가 발생하는 이유 :
        1. 매개변수와 field는 서로 다른 개념
            호출을 가정 -> ObjectTestMain에서 객체 생성을 하게 된다.
        ObjectTest objectTest1 = new ObjectTest("이름");
        ObjectTest objectTest1 = new ObjectTest("주소");
     */

    // Object 클래스의 메서드들을 override

    @Override
    public String toString() {
        return "이름 : " + name + " \n주소 : " + address;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


//    @Override
//    public String toString() {
//        return "ObjectTest{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
