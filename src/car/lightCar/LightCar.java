package car.lightCar;

import car.Car;
import carComponent.*;
import enums.Country;

import java.math.BigDecimal;

public abstract class LightCar extends Car {

    private boolean hasCruiseControl;

    public LightCar(String color, double maxSpeed, String transmission, boolean isMoving,
                    Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Tank tank, Lamps lamps,
                    Engine engine, Electronics electronics, BigDecimal price,
                    boolean hasCruiseControl, Country country) {
        super(color, maxSpeed, transmission, isMoving, wheel1, wheel2, wheel3, wheel4, tank, lamps,
                engine, electronics, price, country);
        this.hasCruiseControl = hasCruiseControl;
    }

    public void turnOnCruise() {
        hasCruiseControl = true;
        System.out.println("Круиз-контроль включен");
    }

    public void turnOffCruise() {
        hasCruiseControl = false;
        System.out.println("Круиз-контроль выключен");
    }


}
