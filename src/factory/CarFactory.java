package factory;

import car.lightCar.cabriolet.Solara;
import car.cargo.Dyna;
import car.cargo.Hiance;
import car.lightCar.Camry;
import enums.Country;
import enums.MaxSpeed;
import enums.Transmission;
import enums.WheelDiameter;

import java.math.BigDecimal;

public class CarFactory extends Factory {
    private final double DYNA_CAPACITY = 2_000;
    private final double DYNHIANCE_CAPACITY = 1_800;

    private final Country country;

    public CarFactory(Country country) {
        this.country = country;
    }

    public Camry createCamry(String color, BigDecimal price) {

        return new Camry(color, MaxSpeed.CAMRY_MAX_SPEED.getMaxSpeed(), Transmission.AUTOMATIC.getType(),
                    false,
                    PartsFactory.createWheel(WheelDiameter.DIAMETER_17),
                    PartsFactory.createWheel(WheelDiameter.DIAMETER_17),
                    PartsFactory.createWheel(WheelDiameter.DIAMETER_17),
                    PartsFactory.createWheel(WheelDiameter.DIAMETER_17),
                    PartsFactory.createTank(),
                    PartsFactory.createLamps(),
                    PartsFactory.createEngine(),
                    PartsFactory.createElectric(),
                    price,
                    true, this.country);
    }

    public Solara createSolara(String color, BigDecimal price) {

        return new Solara(color, MaxSpeed.SOLARA_MAX_SPEED.getMaxSpeed(), Transmission.ROBOT.getType(),
                false,
                PartsFactory.createWheel(WheelDiameter.DIAMETER_16),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_16),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_16),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_16),
                PartsFactory.createTank(),
                PartsFactory.createLamps(),
                PartsFactory.createEngine(),
                PartsFactory.createElectric(),
                price,
                true, this.country, true);
    }

    public Dyna createDyna(String color, BigDecimal price) {

        return new Dyna(color, MaxSpeed.DYNA_MAX_SPEED.getMaxSpeed(), Transmission.MECHANIC.getType(),
                false,
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createTank(),
                PartsFactory.createLamps(),
                PartsFactory.createEngine(),
                PartsFactory.createElectric(),
                price,
                DYNA_CAPACITY, this.country);
    }

    public Hiance createHiance(String color, BigDecimal price) {

        return new Hiance(color, MaxSpeed.HIANCE_MAX_SPEED.getMaxSpeed(), Transmission.ROBOT.getType(),
                false,
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createWheel(WheelDiameter.DIAMETER_20),
                PartsFactory.createTank(),
                PartsFactory.createLamps(),
                PartsFactory.createEngine(),
                PartsFactory.createElectric(),
                price,
                DYNHIANCE_CAPACITY, this.country);
    }

    public Country getCountry() {
        return country;
    }

}
