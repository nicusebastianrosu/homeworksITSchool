import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;
import java.util.Scanner;

public class DayOfWeekCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            DayOfWeek dayOfWeek = date.getDayOfWeek();

            System.out.println("The day of the week for " + inputDate + " is: " + dayOfWeek);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
        }

        scanner.close();
    }
}
