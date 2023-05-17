package org.higherAchievers.streams;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;
import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //creating a map of names ad course aof instructors who teaches online and have more than 10 years of experience

        Predicate<Instructor> p1 = Instructor::isOnlineCourses;
        Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10;

        List<Instructor> list = Instructors.getAll();
        Map<String, List<String>> map = list.stream()
                //.peek(System.out::println) //this is another way of doing debugging ona stream
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(map);
    }
}
