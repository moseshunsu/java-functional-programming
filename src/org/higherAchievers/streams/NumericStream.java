package org.higherAchievers.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class NumericStream {
    public static void main(String[] args) {
        //sum
        int sum = IntStream.rangeClosed(0, 1000).sum();
        System.out.println("Sum of 1000 numbers is: " + sum);

        //min
        OptionalInt min = IntStream.rangeClosed(0, 1000).min();
        if (min.isPresent())
            System.out.println("Minimum of 1000 numbers is: " + min.getAsInt());

        //max
        OptionalInt max = IntStream.rangeClosed(0, 1000).max();
        if (max.isPresent())
            System.out.println("Maximum of 1000 numbers is: " + max.getAsInt());

        //average
        OptionalDouble avg = IntStream.rangeClosed(0, 1000).average();
        System.out.println("Average of 1000 numbers is: " + (avg.isPresent() ? avg.getAsDouble() : 0.0));

        System.out.println("---------------------");
        System.out.println("Testing with Consumer lambda");
        BiConsumer<String, Integer> str = (s, i) -> System.out.println(s + "of 1000 numbers is: " + i);

        if (min.isPresent() && max.isPresent()) {
            str.accept("Minimum", min.getAsInt());
            str.accept("Maximum", max.getAsInt());
        }
    }
}
