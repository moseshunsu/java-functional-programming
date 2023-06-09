package org.higherAchievers.lambda.lambdaIllustrations.lambdaReferences;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;

import java.util.Arrays;

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Moses", 2,
                "Software Developer", "M", false, Arrays.asList("Java Programming",
                        "JavaScript Programming", "Python Programming"));

        System.out.println(instructor);
    }
}
