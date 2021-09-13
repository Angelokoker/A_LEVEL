package ua.syromiatnikov.hw9.planet;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Saturn saturn = (Saturn) o;
        return Double.compare(saturn.result, result) == 0 && Objects.equals(atmosphere, saturn.atmosphere) && Objects.equals(planet, saturn.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atmosphere, planet, result);
    }
}