package homework11;

class Student {
    private String name;
    private double grade;

    // Constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {

        return "Student{name='" + name + "', grade=" + grade + "}";
    }
}