package org.higherAchievers.dateTime;

import java.time.*;

public class ConvertToZoneDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(-10)));

    }

}
