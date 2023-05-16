package org.higherAchievers.lambda.lambdaExpressions.lambdaIntro;

public class HelloWorldLambda {
    public static void main(String[] args) {
        //implementing sayHelloWorld using lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
