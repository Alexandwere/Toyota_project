package car.cargo;

import carComponent.*;
import enums.Country;

import java.math.BigDecimal;

public class Dyna extends Cargo {

    public void charge() {
        System.out.println("Телефон заряжается.");
    }

    public Dyna(String color, double maxSpeed, String transmission, boolean isMoving,
                Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Tank tank, Lamps lamps,
                Engine engine, Electronics electronics, BigDecimal price, double loadCapacity, Country country) {
        super(color, maxSpeed, transmission, isMoving, wheel1, wheel2, wheel3, wheel4, tank, lamps,
                engine, electronics, price, loadCapacity, country);
    }
    
}
