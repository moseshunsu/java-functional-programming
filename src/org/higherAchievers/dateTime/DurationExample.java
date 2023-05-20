package org.higherAchievers.dateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        //duration between 2 LocalDateTime instances
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusHours(2);
        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println("duration.toHours() = " + duration.toHours());

        duration = Duration.ofHours(3);
        System.out.println("duration.toMinutes() = " + duration.toMinutes());

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().plusMinutes(60);
        duration = Duration.between(localTime, localTime1);
        System.out.println("duration = " + duration.toMinutes());


        //note that duration between localDate do not work
//        LocalDate localDate = LocalDate.now();
//        LocalDate localDate1 = LocalDate.now().plusDays(1);
//        duration = Duration.between(localDate1, localDate);
//        System.out.println("duration = " + duration);
        
    }
}
