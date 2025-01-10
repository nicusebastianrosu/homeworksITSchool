package srpAndIsp;

public interface EmailSenderInterface {

    // void sendEmail(Employee employee, String content);
    void sendEmail(Employee employee, EmailContent emailContent);
    // we add this new method
    // void sendHTMLEmail(Employee employee, String content);
}
