package org.higherAchievers.lambda.lambdaIllustrations.predicate;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // all instructor who teaches online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

        //instructor experience is >10
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

        //BiConsumer print names and courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) ->
                System.out.println("name is: " + name + " courses: " + courses);

        instructors.forEach(instructor -> {
            if (p1.and(p2).test(instructor)) {
                biConsumer1.accept(instructor.getName(), instructor.getCourses());
            }
        });

    }
}
