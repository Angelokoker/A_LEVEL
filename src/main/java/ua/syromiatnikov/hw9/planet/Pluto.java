package ua.syromiatnikov.hw9.planet;

import java.util.Objects;

public class Pluto {
    public String atmosphere;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pluto pluto = (Pluto) o;
        return Double.compare(pluto.result, result) == 0 && Objects.equals(atmosphere, pluto.atmosphere) && Objects.equals(planet, pluto.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atmosphere, planet, result);
    }

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