package org.higherAchievers.lambda.lambdaIllustrations.otherLambdaTypes;

import java.util.Comparator;
import java.util.function.*;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(9, 8));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(9, 8));

        IntBinaryOperator intBi = (a, b) -> a * b;
        System.out.println(intBi.applyAsInt(2, 4));

        LongBinaryOperator longBi = (a, b) -> a * b;
        System.out.println(longBi.applyAsLong(2000L, 3000000000L));

        DoubleBinaryOperator doubleBi = (a, b) -> a * b;
        System.out.println(doubleBi.applyAsDouble(22.22, 33.3));

    }
}
