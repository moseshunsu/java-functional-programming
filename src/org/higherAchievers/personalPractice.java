package org.higherAchievers;

import java.util.List;
import java.util.stream.IntStream;

public class personalPractice {

    public static void main(String[] args) {
        IntStream sum = IntStream.rangeClosed(1, 51);

//        sum.filter(( i -> i % 2 != 0)).forEach(System.out::println);

//        sum.filter(( i -> i % 2 == 0)).map( x -> (int) Math.pow(x, 2)).forEach(System.out::println);

//        sum.filter(( i -> i % 2 != 0)).map( x -> (int) Math.pow(x, 3)).forEach(System.out::println);


        List<String> courses = List.of("Spring", "Spring Boot", "AWS");
//        courses.forEach(System.out::println);

//        courses.stream().filter(str -> str.contains("Spring")).forEach(System.out::println);

//        courses.stream().filter(str -> str.length() > 3).forEach(System.out::println);

        courses.forEach(str -> System.out.println(str + " " + str.length()));

        courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);

    }

}
