import car.Car;
import car.StartCarException;
import car.lightCar.cabriolet.Solara;
import car.cargo.Dyna;
import car.cargo.Hiance;
import car.lightCar.Camry;
import factory.CarFactory;
import factory.CountyFactoryNotEqualException;
import factory.Factory;
import factory.PartsFactory;
import warehouse.NoSpaceException;
import warehouse.Warehouse;

import java.math.BigDecimal;
import java.util.ArrayList;

import static enums.CarType.*;
import static enums.Country.*;
import static enums.PriceCar.*;

public class Runner {
    public static void main(String[] args) throws CountyFactoryNotEqualException, NoSpaceException, StartCarException {
        PartsFactory partsFactory = new PartsFactory(JAPAN);
        CarFactory carFactory = new CarFactory(JAPAN);
        Factory.CountryCheck(carFactory, partsFactory);

        Camry camry = carFactory.createCamry("Black", CAMRY_PRICE.getPrice());
        Solara solara = carFactory.createSolara("White", SOLARA_PRICE.getPrice());
        Hiance hiance = carFactory.createHiance("Black", HIANCE_PRICE.getPrice());
        Dyna dyna = carFactory.createDyna("Black", DYNA_PRICE.getPrice());


        Warehouse<Car> carWarehouse = new Warehouse<>();
        carWarehouse.getWareHouse().put(CAMRY, new ArrayList<>());
        carWarehouse.getWareHouse().put(SOLARA, new ArrayList<>());
        carWarehouse.getWareHouse().put(DYNA, new ArrayList<>());
        carWarehouse.getWareHouse().put(HIANCE, new ArrayList<>());
        System.out.println(carWarehouse.getFreeSpace());

        carWarehouse.addCar(CAMRY, camry);
        carWarehouse.addCar(SOLARA, solara);
        carWarehouse.addCar(HIANCE, hiance);
        carWarehouse.addCar(DYNA, dyna);

        System.out.println("Camry - " + carWarehouse.getCountCamry());
        System.out.println("Dyna - " + carWarehouse.getCountDyna());
        System.out.println("Hiance - " + carWarehouse.getCountHiance());
        System.out.println("Solara - " + carWarehouse.getCountSolara());
        System.out.println(carWarehouse.getFreeSpace());
        System.out.println(carWarehouse.getWareHouse().get(CAMRY));


//        camry1.onLamps();
//        solara.coldWater();
//        dyna.charge();
//        hiance1.changeWheel(hiance1.getWheel1(), new Wheel(WheelDiameter.DIAMETER_20.getDiameter()));

    }
}
