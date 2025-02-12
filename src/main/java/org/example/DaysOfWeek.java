package org.example;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String getWeekday() {
        if (this == SATURDAY || this == SUNDAY) {
            return "Weekend";
        }
        return this.name();
    }
}
