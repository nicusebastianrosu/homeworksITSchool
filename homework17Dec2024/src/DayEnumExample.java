public class DayEnumExample {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        // Method to determine if a day is a weekday or weekend
        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            if (day.isWeekend()) {
                System.out.println(day + " is a weekend.");
            } else {
                System.out.println(day + " is a weekday.");
            }
        }
    }
}
