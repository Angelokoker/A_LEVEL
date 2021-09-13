package ua.syromiatnikov.hw9.planet;

public class Saturn {
    public String atmosphere;

    public Saturn(String atmosphere) {
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
        return 11.1186;
    }

    public double speed() {
        return 10.44;
    }
}