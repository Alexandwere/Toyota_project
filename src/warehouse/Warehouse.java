package warehouse;

import car.Car;
import car.cabriolet.Solara;
import car.cargo.Dyna;
import car.cargo.Hiance;
import car.lightCar.Camry;

import java.util.HashMap;

public class Warehouse <T extends Car> {
    private final int capacity = 1000;
    private int freeSpace = capacity;
    private int countCars;
    private int countCamry;
    private int countSolara;
    private int countDyna;
    private int countHiance;
    HashMap<String, Car> wareHouse = new HashMap<>();

    public T addCar(String key, T car) throws NoSpaceException {
        if (freeSpace <= 0) {
            throw new NoSpaceException();
        }
        if (car instanceof Camry) {
            countCamry++;
        } else if (car instanceof Solara) {
            countSolara++;
        } else if (car instanceof Dyna) {
            countDyna++;
        } else if (car instanceof Hiance) {
            countHiance++;
        }
        wareHouse.put(key, car);
        freeSpace--;
        countCars++;
        return car;
    }

    public T removeCar(String key, T car) {
        if (car instanceof Camry) {
            countCamry--;
        } else if (car instanceof Solara) {
            countSolara--;
        } else if (car instanceof Dyna) {
            countDyna--;
        } else if (car instanceof Hiance) {
            countHiance--;
        }
        wareHouse.remove(key, car);
        freeSpace++;
        countCars--;
        return car;
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public int getCountCamry() {
        return countCamry;
    }

    public int getCountSolara() {
        return countSolara;
    }

    public int getCountDyna() {
        return countDyna;
    }

    public int getCountHiance() {
        return countHiance;
    }
}
