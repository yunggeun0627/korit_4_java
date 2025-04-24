package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        // 1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는 것

        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅 방법 #1
        // 형변환을 하기 위해서는 '(바꿀데이터타입)변수명'으로 작성하시면 됩니다.
        System.out.println("변형 : " + (int)cast1);           // 65가 나중에 문자로 뭔지 나옴

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);           // 소문자인 경우는 대문자만큼은 출제X
                                                            //외워야 될 핑요있음

        //업캐스팅 방법 #2
        char cast3 = 'b';
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법
        int casted3 = (int)cast3;
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + (int)casted3);

        // 다운 캐스팅 파트
        int cast4 = 99;         // #1 방법
        int cast5 = 100;        // #2 방법
        // 지시 사항 : 다운캐스팅하는 방법을 업캐스팅 # 1, 2를 참조하여 char 형으로 바꿈
        // 콘솔창에 원형과 변형을 모두 출력
        System.out.println("원형 : " + cast4);
        System.out.println("변형 : " + (char)cast4);

        char casted5 = (char)cast5;
        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + casted5);

        /*
            upcasting 의 경우 메모리 용량이 커지기만 하면 되니까
            기존 데이터가 변형이 일어나지 않기 때문에 암시적(implicit)으로 변형이 가능한 반면
            downcaasting의 경우에는 데이터를 축소하는 과정에서 메모리 용량을 벗어나게 된느
            경우가 있습니다. 용량 오버에 해당하는 현상을 미리 점검하기 위해
            다운 캐스팅 시에는 명시적(explicit)으로만 변형아 가능합니다.
         */
    }
}
