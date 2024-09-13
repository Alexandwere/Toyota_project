package car.lightCar;

import carComponent.*;
import enums.Country;

import java.math.BigDecimal;

public final class Camry extends LightCar {

    private boolean hasUsb = true;

    public Camry(String color, double maxSpeed, String transmission, boolean isMoving,
                 Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Tank tank, Lamps lamps,
                 Engine engine, Electronics electronics, BigDecimal price, boolean hasCruiseControl, Country country) {
        super(color, maxSpeed, transmission, isMoving, wheel1, wheel2, wheel3, wheel4, tank, lamps,
                engine, electronics, price, hasCruiseControl, country);
    }
}
