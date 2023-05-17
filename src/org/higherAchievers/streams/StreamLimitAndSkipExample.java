package org.higherAchievers.streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> limit5Numbers = numbers.stream().limit(5).toList();
        limit5Numbers.forEach(System.out::println);

        System.out.println("--------------");
        List<Integer> skip5numbers = numbers.stream().skip(5).toList();
        skip5numbers.forEach(System.out::println);

    }
}
