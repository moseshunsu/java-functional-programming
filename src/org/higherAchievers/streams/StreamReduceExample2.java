package org.higherAchievers.streams;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the instructor who has the highest years of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .reduce((s1, s2) -> s2.getYearsOfExperience() > s1.getYearsOfExperience() ? s2 : s1);

        instructor.ifPresent(System.out::println);
    }
}
