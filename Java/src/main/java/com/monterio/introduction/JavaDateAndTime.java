package com.monterio.introduction;

import java.time.LocalDate;

public class JavaDateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(Integer.valueOf(year),
                Integer.valueOf(month),
                Integer.valueOf(day));
        String dayOfWeek = String.valueOf(localDate.getDayOfWeek());
        return dayOfWeek;
    }
}
