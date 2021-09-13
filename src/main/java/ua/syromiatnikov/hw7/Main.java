package ua.syromiatnikov.hw7;

public class  Main {
    public static void main(String[] args) {
        Student student = new Student("Nikolay", "Popov", "Group1", 5.1);
        Aspirant aspirant = new Aspirant("Geography", "Vasya", "Petrov", "Group2", 4.9);
        Student[] students ={student,aspirant};
        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
    }
}