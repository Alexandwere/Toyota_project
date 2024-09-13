package car;

import carComponent.*;
import enums.Country;

import java.math.BigDecimal;

public class Car {
    protected Country country;
    protected String color;
    protected double maxSpeed;
    protected String transmission;
    protected boolean isMoving;

    protected Wheel wheel1;
    protected Wheel wheel2;
    protected Wheel wheel3;
    protected Wheel wheel4;

    protected Tank tank;
    protected Lamps lamps;
    protected Engine engine;
    protected Electronics electronics;
    protected BigDecimal price;

    public Car(String color, double maxSpeed, String transmission, boolean isMoving,
               Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4,
               Tank tank, Lamps lamps, Engine engine, Electronics electronics, BigDecimal price, Country country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.isMoving = isMoving;
        if (!checkWheel(wheel1, wheel2, wheel3, wheel4)) {
            throw new RuntimeException("Проблема с колесами при создании машины.");
        } else {
            this.wheel1 = wheel1;
            this.wheel2 = wheel2;
            this.wheel3 = wheel3;
            this.wheel4 = wheel4;
        }
        this.tank = tank;
        this.lamps = lamps;
        this.engine = engine;
        this.electronics = electronics;
        this.price = price;
        this.country = country;
    }

    public void start() throws StartCarException {

        if (wheel1.isCorrect() && wheel2.isCorrect() && wheel3.isCorrect() && wheel4.isCorrect()
                && tank.getVolumeFuel() > 0
                && engine.isWorking()
                && electronics.isWorking()) {
            isMoving = true;
            System.out.println("Машина поехала.");
        } else {
            throw new StartCarException("Машина не может ехать.");
        }
    }

    public void stop() {
        isMoving = false;
    }

    public void onLamps() {
        System.out.println("Фары работают");
    }

    public static boolean checkWheel(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4) {
        return wheel1.getDiameter() == wheel2.getDiameter()
                && wheel1.getDiameter() == wheel3.getDiameter()
                && wheel1.getDiameter() == wheel4.getDiameter();
    }

    public void changeWheel(Wheel wheel, Wheel newWheel) {
        if (newWheel.getDiameter() == wheel.getDiameter()) {
            System.out.println("Колесо заменено.");
            wheel = newWheel;
        } else {
            System.out.println("Нельзя заменить на колесо другого диаметра.");
        }
    }

    public Country getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Wheel getWheel1() {
        return wheel1;
    }

    public Wheel getWheel2() {
        return wheel2;
    }

    public Wheel getWheel3() {
        return wheel3;
    }

    public Wheel getWheel4() {
        return wheel4;
    }

    public Tank getTank() {
        return tank;
    }

    public Lamps getLamps() {
        return lamps;
    }

    public Engine getEngine() {
        return engine;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
