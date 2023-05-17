package org.higherAchievers.streams;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

import java.util.List;

public class StreamsOperations {
    public static void main(String[] args) {
        //count distinct

        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();

        System.out.println(count);

        //distinct sort
        List<String> courses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();

        System.out.println(courses);

        //anyMatch, allMatch, and noMatch
        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
//                .anyMatch(s -> s.startsWith("J"));
//                .allMatch(s -> s.startsWith("J"));
                .noneMatch(s -> s.startsWith("J"));

        System.out.println(match);


    }
}
