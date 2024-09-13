package car.cargo;

import car.Car;
import carComponent.*;
import enums.Country;

import java.math.BigDecimal;
import java.util.Objects;

public class Cargo extends Car {

    private final double loadCapacity;

    public Cargo(String color, double maxSpeed, String transmission, boolean isMoving,
                 Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Tank tank, Lamps lamps,
                 Engine engine, Electronics electronics, BigDecimal price, double loadCapacity, Country country) {
        super(color, maxSpeed, transmission, isMoving, wheel1, wheel2, wheel3, wheel4, tank, lamps,
                engine, electronics, price, country);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo = (Cargo) o;
        return Double.compare(loadCapacity, cargo.loadCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadCapacity);
    }
}
