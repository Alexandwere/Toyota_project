package car.cabriolet;

import carComponent.*;
import enums.Country;

import java.math.BigDecimal;

public class Solara extends Cabriolet {

    public static final double MAX_SPEED = 190;

    public Solara(String color, double maxSpeed, String transmission, boolean isMoving,
                  Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Tank tank, Lamps lamps,
                  Engine engine, Electronics electronics, BigDecimal price, boolean hasCruiseControl,
                  Country country, boolean hasUpRoof) {
        super(color, maxSpeed, transmission, isMoving, wheel1, wheel2, wheel3, wheel4, tank, lamps,
                engine, electronics, price, hasCruiseControl, country, hasUpRoof);
    }

    public void coldWater() {
        System.out.println("Напиток охлаждается!");
    }


}
