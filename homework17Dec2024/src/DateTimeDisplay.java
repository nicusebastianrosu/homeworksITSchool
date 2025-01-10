import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDisplay {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        String formattedDate1 = currentDateTime.format(format1);
        String formattedDate2 = currentDateTime.format(format2);
        String formattedTime = currentDateTime.format(format3);
        String formattedDateTime1 = currentDateTime.format(format4);
        String formattedDateTime2 = currentDateTime.format(format5);

        System.out.println("Current date in dd-MM-yyyy format: " + formattedDate1);
        System.out.println("Current date in MM/dd/yyyy format: " + formattedDate2);
        System.out.println("Current time in HH:mm:ss format: " + formattedTime);
        System.out.println("Current date and time in 'EEEE, MMMM dd, yyyy HH:mm:ss' format: " + formattedDateTime1);
        System.out.println("Current date and time in 'yyyy/MM/dd HH:mm' format: " + formattedDateTime2);
    }
}
