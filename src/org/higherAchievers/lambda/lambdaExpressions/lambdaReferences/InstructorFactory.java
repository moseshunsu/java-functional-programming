package org.higherAchievers.lambda.lambdaExpressions.lambdaReferences;

import org.higherAchievers.lambda.lambdaExpressions.referenceClass.Instructor;

import java.util.List;

public interface InstructorFactory {
    Instructor getInstructor (String name, int yearsOfExperience, String title, String gender,
                              boolean onlineCourse, List<String> courses);

}

