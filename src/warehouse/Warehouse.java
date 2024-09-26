package warehouse;

import car.Car;
import car.cabriolet.Solara;
import car.cargo.Dyna;
import car.cargo.Hiance;
import car.lightCar.Camry;
import enums.CarType;

import java.util.ArrayList;
import java.util.HashMap;

public class Warehouse <T extends Car> {
    private final int capacity = 1000;
    private int freeSpace = capacity;
    private int countCars;
    private int countCamry;
    private int countSolara;
    private int countDyna;
    private int countHiance;
    HashMap<Enum, ArrayList<T>> wareHouse = new HashMap<>(){};

    public HashMap<Enum, ArrayList<T>> getWareHouse() {
        return wareHouse;
    }

    public T addCar(Enum key, T car) throws NoSpaceException {
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

        wareHouse.get(key).add(car);

        freeSpace--;
        countCars++;
        return car;
    }

    public T removeCar(Enum key, T car) {
        if (car instanceof Camry) {
            countCamry--;
        } else if (car instanceof Solara) {
            countSolara--;
        } else if (car instanceof Dyna) {
            countDyna--;
        } else if (car instanceof Hiance) {
            countHiance--;
        }
        wareHouse.get(key).remove(car);
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
