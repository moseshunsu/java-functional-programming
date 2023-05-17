package org.higherAchievers.streams;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll().stream().findAny();
        instructorOptional.ifPresent(System.out::println);

        instructorOptional = Instructors.getAll().stream().findFirst();
        instructorOptional.ifPresent(System.out::println);

    }
}
