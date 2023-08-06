package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성

        //Arrays.stream
        int[] score = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(score);

        String[] langs = {"python", "java","javascript","c","c++","c#"};
        Stream<String> stream = Arrays.stream(langs);

        //Collection.stream()
        List<String> langList = new ArrayList<>();

        langList = Arrays.asList("python", "java","javascript","c","c++","c#");
        //System.out.println(langStream.size());
        Stream<String> langListStream = langList.stream();

        //Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");


        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip
        // 최종 연산 (Terminal Operation) : count, min, max, foreach, sum

        // 90점 이상인 점수만 출력
        Arrays.stream(score).filter( x -> x>=90).forEach(x-> System.out.println(x));
        // Arrays.stream(score).filter( x -> x>=90).forEach(System.out::println);
        System.out.println("-----------------");

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(score).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("-----------------");

        //90점 이상인 점수들의 합
        int sum = Arrays.stream(score).filter(x->x>=90).sum();
        System.out.println(sum);
        System.out.println("-----------------");

        // 90점 이상인 점수들을 정렬하기
        Arrays.stream(score).filter(x->x>=90).sorted().forEach(System.out::println);
        System.out.println("-----------------");

        // "python", "java","javascript","c","c++","c#"

        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x->x.startsWith("c")).forEach(System.out::println);
        System.out.println("-----------------");

        // java라는 프로그램 언어가 포함하는 것
        Arrays.stream(langs).filter(x->x.contains("java")).forEach(System.out::println);
        System.out.println("-----------------");

        // 글자 길이가 4 이하인 언어
        langList.stream().filter(x->x.length()<=4).sorted().forEach(System.out::println);
        System.out.println("-----------------");

        // 4글자 이하인 언어 중에 "c"가 포함된 언어
        langList.stream().
                filter(x->x.length()<=4).
                filter(x-> x.contains("c")).
                forEach(System.out::println);
        System.out.println("-----------------");

        // 4글자 이하인 언어 중에 c라는 글자를 포함하는 언어가 있는지?
        boolean anyMatch = langList.stream().
                filter(x -> x.length() <= 4).
                anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-----------------");

        // 3글자 이하인 언어중에 c라는 언어가 모두 포함하는지?
        boolean allMatch = langList.stream().
                filter(x -> x.length() <= 3).
                allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("-----------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 함께 출력
        langList.stream().
                filter(x->x.length()<=4).
                filter(x->x.contains("c")).
                map(x-> x + " (어려워요)").
                forEach(System.out::println);

        System.out.println("-----------------");

        // c라는 글자를 포함하는 언어를 대문자로 변환
        langList.stream().
                filter(x->x.contains("c")).
                map(String :: toUpperCase).
                forEach(System.out::println);

        System.out.println("-----------------");

        // c라는 글자를 포함하는 언어를 대문자로 변환하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream().
                filter(x -> x.contains("c")).
                map(String::toUpperCase).
                collect(Collectors.toList());

        System.out.println(langListStartsWithC);
        langListStartsWithC.stream().forEach(System.out::println);
        System.out.println("-----------------");
    }
}
