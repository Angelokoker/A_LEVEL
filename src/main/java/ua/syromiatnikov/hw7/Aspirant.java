package ua.syromiatnikov.hw7;

public class Aspirant extends Student {
   protected String scienceWork;

    public Aspirant(String scienceWork,String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }
}

