package ua.syromiatnikov.hw9.planet;

public class Earth {
    public String atmosphere;

    public Earth(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public double getFreeFallAcceleration() {
        return 9.81;
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
        return 9.81;
    }

    public double speed() {
        return 9.81;
    }

}
