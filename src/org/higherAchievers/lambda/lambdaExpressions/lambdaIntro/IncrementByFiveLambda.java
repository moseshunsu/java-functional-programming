package org.higherAchievers.lambda.lambdaExpressions.lambdaIntro;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = (x) -> x + 5;
        System.out.println(incrementByFiveInterface.incrementByFive(2));
    }
}