package car.lightCar.cabriolet;

import car.lightCar.LightCar;
import carComponent.*;
import enums.Country;

import java.math.BigDecimal;

public abstract class Cabriolet extends LightCar {

    private boolean hasUpRoof = true;

    public Cabriolet(String color, double maxSpeed, String transmission, boolean isMoving,
                     Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Tank tank, Lamps lamps,
                     Engine engine, Electronics electronics, BigDecimal price, boolean hasCruiseControl,
                     Country country, boolean hasUpRoof) {
        super(color, maxSpeed, transmission, isMoving, wheel1, wheel2, wheel3, wheel4, tank, lamps,
                engine, electronics, price, hasCruiseControl, country);
        this.hasUpRoof = hasUpRoof;
    }

    public void raiseRoof() {
        hasUpRoof = true;
        System.out.println("Крыша поднята");
    }

    public void lowerRoof() {
        hasUpRoof = false;
        System.out.println("Крыша опущена");
    }
}
