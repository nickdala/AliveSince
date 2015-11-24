package com.nick.example.core;

import org.joda.time.LocalDate;
import org.joda.time.Days;
import org.joda.time.Months;
import org.joda.time.Weeks;
import org.joda.time.Years;

public class AliveSince {
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int yearsAlive;
    private int monthsAlive;
    private int weeksAlive;
    private int daysAlive;

    public AliveSince(int birthYear, int birthMonth, int birthDay) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;

        LocalDate now = LocalDate.now();
        LocalDate birthDateTime = new LocalDate(birthYear, birthMonth, birthDay);

        yearsAlive = Years.yearsBetween(birthDateTime, now).getYears();
        monthsAlive = Months.monthsBetween(birthDateTime, now).getMonths();
        daysAlive = Days.daysBetween(birthDateTime, now).getDays();
        weeksAlive = Weeks.weeksBetween(birthDateTime, now).getWeeks();
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getYearsAlive() {
        return yearsAlive;
    }

    public int getMonthsAlive() {
        return monthsAlive;
    }

    public int getWeeksAlive() {
        return weeksAlive;
    }

    public int getDaysAlive() {
        return daysAlive;
    }
}
