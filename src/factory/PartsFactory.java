package factory;

import carComponent.*;
import enums.Country;
import enums.WheelDiameter;

public class PartsFactory extends Factory {
    private Country country;

    public PartsFactory(Country country) {
        this.country = country;
    }

    private static final boolean TRUE_CONDITION = true;
    private static final double EMPTY_TANK = 0;

    public static Electronics createElectric() {
        return new Electronics(TRUE_CONDITION);
    }

    public static Engine createEngine() {
        return new Engine(TRUE_CONDITION);
    }

    public static Lamps createLamps() {
     return new Lamps(TRUE_CONDITION);
    }

    public static Tank createTank() {
        return new Tank(EMPTY_TANK);
    }

    public static Wheel createWheel(WheelDiameter e) {
        return new Wheel(e.getDiameter());
    }

    public Country getCountry() {
        return country;
    }
}
