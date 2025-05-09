package ch24_stream;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "최칠");

        // filler()
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();      // to어쩌고 메서드가 실행되었다는 말, 이전의 자료형이 절대 List가 아니라는 점

        // filter는 그 자체로 한 방에 쓰이기 보다는 합쳐서 쓰임.
        // filer / map / sorted / collect
        List<String> englistNames = Arrays.asList("alice", "anya", "bacon", "camel", "pascal", "yor", "spy", "family");
        List<String> result = englistNames.stream()
                // . 사이에 다양한 메서드를 쓰라는 의미(마치 Build 패턴할 때 .build()가 자동생성됐었돈 것처럼)
                .filter(name -> name.startsWith("a"))       // "a"로 시작하는 element만 추출
                .map(String::toUpperCase)                         // 결과값으로 "a"로시작하는 걸 뽑았는데. 대문자로 변환
                .sorted()                                         // 정렬입니다 sort()가 아니고, 일관성이 없다
                .toList();                                        // List 자료형으로 변경

        System.out.println(englistNames);
        System.out.println(result);


        // count
        int count1 = englistNames.size();       // element의 전체 개수를 세는 것만 가능
        System.out.println(count1);

        long count2 = englistNames.stream().filter(name -> name.length() > 3).count();
        System.out.println(count2);

        // 35라인을 기존 방식대로 작성한다고 가정
        // 일반 for / 향상된 for 쓸지 결정 -> List 내부 element들을 뽑아낸다.
        int count3 = 0;
        for(int i = 0; i < englistNames.size(); i++) {
            // 각 element의 String 길이가 3초과인지 확인하는 조건문을 작성
            if(englistNames.get(i).length() > 3) {
                count3++;
            }
        }
        System.out.println(count3);

        System.out.println(names);
        System.out.println(namesWithKim);
    }
}
