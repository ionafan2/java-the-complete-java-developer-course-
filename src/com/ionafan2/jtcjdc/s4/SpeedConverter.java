package com.ionafan2.jtcjdc.s4;

/**
 * @see "https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4585756"
 */
public class SpeedConverter {

    public static long toMilesPerHour(double kmh) {

        if (kmh < 0) {
            return -1;
        }

        return Math.round(kmh / 1.609);
    }

    public static void printConversion(double param) {

        if (param < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(param + " km/h = " + toMilesPerHour(param) + " mi/h");
        }
    }
}
