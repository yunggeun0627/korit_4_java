package ch16_objects.teacher;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);
        boolean result2 = teacher1 == teacher2;
        System.out.println(result2);

        /*
            .equals()의 경우에는 주소지가 아니라 속성값아 서로 일치하는지를 확인
            == 의 경우에는 주소지까지 같은지 확인
         */
        // 주소확인
        System.out.println(teacher1);
        System.out.println(teacher2);

        String name = "안근수";
        boolean result3 = name.equals("안근수");
        System.out.println(result3);    // true
        boolean result4 = name == "안근수";
        System.out.println(result4);    // true

        String name2 = new String("안근수");

        boolean result5 = name.equals(name2);
        System.out.println(result5);    // true
        boolean result6 = name == name2;
        System.out.println(result6);    // false

        /*
            .equals의 결과값ㅇ =/= ==의 결과값
         */

    }
}
