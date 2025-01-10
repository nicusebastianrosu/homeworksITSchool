package srpAndIsp;

public interface EmployeeStoreInterface {

    Employee getEmployeeById(long id);

    void addEmployee(Employee employee);

    //void sendEmail(Employee employee, String content);
    // // we add this new method
    //void sendHTMLEmail(Employee employee, String content);
}
