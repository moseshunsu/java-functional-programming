package org.higherAchievers.lambda.functionalProgramming.otherLambdaTypes;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        // Note that supplier interface do not take any output but returns something as the output

        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
        System.out.println(supplier.get());
        System.out.println(supplier.get());

    }
}
