package ua.syromiatnikov.hw9.planet;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mercury mercury = (Mercury) o;
        return Double.compare(mercury.result, result) == 0 && Objects.equals(atmosphere, mercury.atmosphere) && Objects.equals(planet, mercury.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atmosphere, planet, result);
    }
}