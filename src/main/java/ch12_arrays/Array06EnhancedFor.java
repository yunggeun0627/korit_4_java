package ch12_arrays;
/*
     향상된 for문(Enhanced For Loop)

    일반 for문과의 차이점 :
        일반 for문의 경우 인덱스 넘버(주소지)를 명확하게 알고 있어야 하지만 일일이 element의 숫자를
        세는 것이 번거롭기 때문에 배열명.length와 같은 방식으로 int값을 추출해서 한계값에 대입했습니다.

        그런데 잘 생각해보면 for (int i = 0 ; ...)으로 작성할 때 int i는 for문의 내부에서 선언됩니다
        (일종의 지역변수라고 볼 수 있습니다)

        이를 응용하여 배열내의 element를 변수에 대입하는 지역 변수를 선언하는 방식으로
        index 넘버의 사용 없이 바로 적용이 가능한 for 반복문이 있는데,
        이를 향상된 for문이라고 합니다.

        제약 :
            읽기만 되고, 쓰기가 안됩니다(예를 들어 1부터 100까지 추출하는건 되는데, 1부터 100까지 입력은
            불가능할 때가 있습니다)

        형식 :
        for (자료형 변수명 : 반복가능객체(배열)) {
            반복실행문
        }
 */
public class Array06EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = new int[200];
        // 1부터 200까지 대입하시오.
        for ( int i = 0 ; i < numbers.length ; i++ ){
            numbers[i] = i+1;
        }

        // for문을 통해 1 2 3 4 5 ... 200을 출력하시오.   -> 저는 그냥 method에 작성하겠습니다.

        String[] names = {"강미경", "김광호", "김규철", "김대웅", "김명규", "김민성", "김민효",
                "김서준", "김선영", "김재원", "김종보", "김호섭", "노소정", "염진우", "예영근",
                "이수원", "이진혁", "정선유", "제다정"};

        // for문을 통해 이름을 강미경 / 김광호 / 김규철 / 김대웅 ... / 제다정 으로 출력하시오.
        // -> 저는 그냥 method에 작성하겠습니다.

        // printElem(배열) 형태로 메서드로 정의하시오. -> int배열과 String 배열에 다 사용할 수 있도록
        // method overloading도 적용하시오.
        // 메서드 호출을 위한 객체 생성
        Array06EnhancedFor array06EnhancedFor = new Array06EnhancedFor();
        array06EnhancedFor.printElem(numbers);
        array06EnhancedFor.printElem(names);
    }
    public void printElem(int[] numbers) {
        for ( int i = 0 ; i < numbers.length ; i++ ) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for ( int number : numbers ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public void printElem(String[] names) {
        // 향상된 for문의 형식으로 작성하겠습니다.
        //for (자료형 변수명 : 반복가능객체(배열))
        for (String name : names) {
            System.out.print(name + " / ");               // 출력문 쓰는 방법의 차이에 주목할 필요가 있습니다.
        }

    }


}