import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateInput = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthdate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("You are " + years + " years, " + months + " months, and " + days + " days old.");
        scanner.close();
    }
}
