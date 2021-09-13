package ua.syromiatnikov.hw7;

public class Student {
    protected String firstName, lastName, group;
    protected double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return averageMark == 5 ? 100 : 80;
}
}

