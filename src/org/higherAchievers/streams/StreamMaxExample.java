package org.higherAchievers.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //max using stream max function
        Optional<Integer> result = numbers.stream().max(Integer::compareTo);
        result.ifPresent(System.out::println);

        int result2 = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);

        Optional<Integer> result3 = numbers.stream().reduce((a, b) -> a > b ? a : b);
        result3.ifPresent(System.out::println);

        Optional<Integer> result4 = numbers.stream().reduce(Integer::max);
        result4.ifPresent(System.out::println);

    }
}
