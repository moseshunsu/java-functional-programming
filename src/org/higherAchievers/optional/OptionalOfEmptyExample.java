package org.higherAchievers.optional;

import java.util.Optional;

public class OptionalOfEmptyExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hello World");
        System.out.println("OptionalString = " + optionalString);

        System.out.println("getWords: " + getWords());
    }

    public static Optional<String> getWords() {
        String[] words = new String[10];
        words[1] = "test";
        Optional<String> optionalS = Optional.ofNullable(words[1]);
//        if (optionalS.isPresent())
//            return optionalS;
//        else
//            return Optional.empty();

        return optionalS; // an alternative of writing the above if-else statement
        }

}
