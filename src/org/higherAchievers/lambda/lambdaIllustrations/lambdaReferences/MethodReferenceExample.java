package org.higherAchievers.lambda.lambdaIllustrations.lambdaReferences;

import org.higherAchievers.lambda.lambdaIllustrations.referenceClass.Instructor;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Predicate<Instructor> p1 = i -> i.isOnlineCourses();
        Predicate<Instructor> p2 = Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt1 = n -> Math.sqrt(n);
        Function<Integer, Double> sqrt2 = Math::sqrt;

        Function<String, String> lowerCaseFunction1 = s -> s.toLowerCase();
        Function<String, String> lowerCaseFunction2 = String::toLowerCase;

    }
}
