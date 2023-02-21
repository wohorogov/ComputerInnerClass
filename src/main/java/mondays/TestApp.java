package mondays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestApp {
    public void start() {
        int year = 2023;
        int month = 1;
        int dayOfMonth = 1;
        //Calendar calendar = new GregorianCalendar(year, Calendar.JANUARY, dayOfMonth);
        DayOfWeek dayOfWeek = LocalDate.of(year, month, dayOfMonth).getDayOfWeek();

        switch (dayOfWeek) {
            case TUESDAY -> {
                dayOfMonth += 6;
                break;
            }
            case WEDNESDAY -> {
                dayOfMonth += 5;
                break;
            }
            case THURSDAY -> {
                dayOfMonth += 4;
                break;
            }
            case FRIDAY -> {
                dayOfMonth += 3;
                break;
            }
            case SATURDAY -> {
                dayOfMonth += 2;
                break;
            }
            case SUNDAY -> {
                dayOfMonth += 1;
                break;
            }
        }

        Calendar calendar = new GregorianCalendar(year, Calendar.JANUARY, dayOfMonth);
        Calendar maxDate = new GregorianCalendar(2024, Calendar.JANUARY, 1);
        assert false;
        while (calendar.compareTo(maxDate) <  1) {
            System.out.println(calendar.getTime());
            calendar.add(Calendar.DAY_OF_MONTH, 7);
        }
        System.out.println("The end.");
    }
}
