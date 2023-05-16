package org.higherAchievers.lambda.functionalProgramming.lambdaReferences;

import org.higherAchievers.lambda.functionalProgramming.referenceClass.Instructor;
import org.higherAchievers.lambda.functionalProgramming.referenceClass.Instructors;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {

        Predicate<Instructor> p2 = ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience;

        Instructors.getAll().forEach(instructor -> {
            if (p2.test(instructor)) {
                System.out.println(instructor);
            }
        });

    }

    public static boolean greaterThanTenYearsOfExperience(Instructor instructor) {
        return instructor.getYearsOfExperience() > 10;
    }
}
