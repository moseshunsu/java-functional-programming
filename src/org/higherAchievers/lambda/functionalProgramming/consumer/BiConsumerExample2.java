package org.higherAchievers.lambda.functionalProgramming.consumer;

import org.higherAchievers.lambda.functionalProgramming.referenceClass.Instructor;
import org.higherAchievers.lambda.functionalProgramming.referenceClass.Instructors;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        BiConsumer<String, String> biConsumer1 = (name, gender) -> System.out.println("name is: " + name +
                " and gender is: " + gender);
        //biConsumer1.accept("Moses", "male");
        instructors.forEach(instructor -> biConsumer1.accept(instructor.getName(), instructor.getGender()));
        System.out.println("-------------------");

        // print out name and list of courses
        BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> System.out.println("name is: " + name +
                " courses: " + courses);
        instructors.forEach(instructor -> biConsumer2.accept(instructor.getName(), instructor.getCourses()));

        //print out name and gender of all instructors who teaches online
        System.out.println("-------------------");
        instructors.forEach(instructor -> {
            if (instructor.isOnlineCourses())
                biConsumer1.accept(instructor.getName(), instructor.getGender());
        });

    }
}
