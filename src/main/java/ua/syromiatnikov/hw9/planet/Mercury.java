package ua.syromiatnikov.hw9.planet;

public class Mercury {
    public String atmosphere;

    public Mercury(String atmosphere) {
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
        return 1.3986;
    }

    public double speed() {
        return 3.70;
    }
}