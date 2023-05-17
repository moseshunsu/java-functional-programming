package org.higherAchievers.streams;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

import java.util.Comparator;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        //returning instructors sorted by their name and have more than 1- years of experience

        List<Instructor> list = Instructors.getAll().stream()
                .filter(instructor -> instructor.getYearsOfExperience() > 10)
                .sorted(Comparator.comparing(Instructor::getName))
                .toList();

        list.forEach(System.out::println);
    }
}
