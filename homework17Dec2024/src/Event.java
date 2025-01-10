import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private LocalDateTime eventTime;

    public Event(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }

    public String timeUntilEvent() {
        LocalDateTime now = LocalDateTime.now();
        if (eventTime.isBefore(now)) {
            return "The event has already occurred.";
        } else {
            Duration duration = Duration.between(now, eventTime);
            long days = duration.toDays();
            duration = duration.minusDays(days);
            long hours = duration.toHours();
            duration = duration.minusHours(hours);
            long minutes = duration.toMinutes();
            duration = duration.minusMinutes(minutes);
            long seconds = duration.getSeconds();

            return String.format("%d days, %d hours, %d minutes, and %d seconds", days, hours, minutes, seconds);
        }
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime eventDateTime = LocalDateTime.parse("2024-12-31 23:59:59", formatter);

        Event event = new Event(eventDateTime);
        System.out.println("Time until event: " + event.timeUntilEvent());
    }
}
