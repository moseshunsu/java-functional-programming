package org.higherAchievers.streams;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        // total years of experience b/w instructors
        int result = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
