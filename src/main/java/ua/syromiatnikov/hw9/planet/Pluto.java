package ua.syromiatnikov.hw9.planet;

public class Pluto {
    public String atmosphere;

    public Pluto(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    Planet planet = Double::sum;
    double result = planet.getAccelerationOfGravity(power(), speed());

    public boolean searchAtmosphere() {
        if (atmosphere == "Yes") {
            return true;
        }
        return false;
    }

    public double power() {
        return 0.038871;
    }

    public double speed() {
        return 0.617;
    }
}