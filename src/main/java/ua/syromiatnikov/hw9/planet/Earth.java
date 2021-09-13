package ua.syromiatnikov.hw9.planet;

import java.util.Objects;

public class Earth {
    public String atmosphere;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Earth earth = (Earth) o;
        return Double.compare(earth.result, result) == 0 && Objects.equals(atmosphere, earth.atmosphere) && Objects.equals(planet, earth.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atmosphere, planet, result);
    }

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
