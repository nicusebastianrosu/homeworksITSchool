public class Person {
    private String name;
    private int age;
    private boolean isAdult;
    private String cnp;
    private boolean hasJob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            return;
        }
        isAdult = age >= 18;
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }


    public Person(String name, int age, boolean isAdult, String cnp, boolean hasJob) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
        this.cnp = cnp;
        this.hasJob = hasJob;
    }

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
