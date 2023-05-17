package org.higherAchievers.streams;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {
    public static void main(String[] args) {
        //return all instructors sorted by their name
        List<Instructor> list = Instructors.getAll().stream()
//                .sorted(Comparator.comparing(Instructor::getName))
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .toList();

        list.forEach(System.out::println);
    }
}
