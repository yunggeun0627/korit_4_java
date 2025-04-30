package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();  // Java 내장 클래스로 객체 생성

        ResponseDate<String> responseDate1 = new ResponseDate<>("날짜 저장 성공", now.toString());
        // <T>에서 T가 클래스이기 때문에 기본자료형이 못들어간다.
        ResponseDate<Integer> responseDate2 = new ResponseDate<>("나이 저장 성공 : ", 38);
        ResponseDate<Date> responseDate3 = new ResponseDate<>("날씨 객체 저장 성공 : ", now);

        System.out.println(responseDate1);      // ResponseData 클래스에 @Data가 있으니까 toString()이 있다고 볼 수 있다
        System.out.println(responseDate2);
        System.out.println(responseDate3);
    }
}
