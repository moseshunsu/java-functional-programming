package org.higherAchievers.streams;

import java.util.*;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //Stream min function
        Optional<Integer> result = numbers.stream().min(Integer::compareTo);
        result.ifPresent(System.out::println);

        //reduce function
        int result1 = numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println(result1);

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        result2.ifPresent(System.out::println);

        Optional<Integer> result3 = numbers.stream().reduce(Integer::min);
        result3.ifPresent(System.out::println);

    }

}
