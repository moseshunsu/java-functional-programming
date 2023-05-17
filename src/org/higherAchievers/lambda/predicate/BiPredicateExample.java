package org.higherAchievers.lambda.predicate;

import org.higherAchievers.lambda.referenceClass.Instructor;
import org.higherAchievers.lambda.referenceClass.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        // all instructor who teaches online
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses() == true;

        //instructor experience is >10
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

        //BiPredicate
        BiPredicate<Boolean, Integer> p3 = (online, experience) -> online == true && experience > 10;

        //BiConsumer print names and courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) ->
                System.out.println("name is: " + name + " courses: " + courses);

        instructors.forEach(instructor -> {
            if (p3.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience())) {
                biConsumer1.accept(instructor.getName(), instructor.getCourses());
            }
        });

    }
}
