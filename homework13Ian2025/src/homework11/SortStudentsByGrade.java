package homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudentsByGrade {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85.5));
        students.add(new Student("Bob", 92.0));
        students.add(new Student("Charlie", 78.0));
        students.add(new Student("Diana", 88.0));
        students.add(new Student("Eve", 95.0));

        // Sort students by their grades in ascending order
        List<Student> sortedStudents = students.stream()
                .sorted((s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()))
                .collect(Collectors.toList());

        // Output the sorted list of students
        System.out.println("Students sorted by grades in ascending order:");
        sortedStudents.forEach(System.out::println);
    }
}