package kata1;

import java.util.Date;

/**
 *
 * @author Eduardo Maldonado Fernández
 */
public class Person {

    private final String name;
    private final Date birthday;
    private static final double DAYS_PER_YEAR = 365.25;
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MILLISECONDS_PER_SECOND = 1000;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Date today = new Date();
        return toYears(today.getTime() - birthday.getTime());
    }

    private int toYears(long ms) {
        return (int) (ms / millisecondsPerYear());
    }

    private double millisecondsPerYear() {
        return MILLISECONDS_PER_SECOND
                * SECONDS_PER_MINUTE
                * MINUTES_PER_HOUR
                * HOURS_PER_DAY
                * DAYS_PER_YEAR;

    }

}
