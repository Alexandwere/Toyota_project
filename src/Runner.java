import car.Car;
import car.StartCarException;
import car.cabriolet.Solara;
import car.cargo.Dyna;
import car.cargo.Hiance;
import car.lightCar.Camry;
import carComponent.Wheel;
import enums.CarType;
import enums.Country;
import enums.WheelDiameter;
import factory.CarFactory;
import factory.CountyFactoryNotEqualException;
import factory.Factory;
import factory.PartsFactory;
import warehouse.NoSpaceException;
import warehouse.Warehouse;

import java.math.BigDecimal;
import java.util.ArrayList;

import static enums.CarType.*;

public class Runner {
    public static void main(String[] args) throws CountyFactoryNotEqualException, NoSpaceException, StartCarException {
        PartsFactory partsFactory = new PartsFactory(Country.JAPAN);
        CarFactory carFactory = new CarFactory(Country.JAPAN);
        Factory.CountryCheck(carFactory, partsFactory);
        Camry camry1 = carFactory.createCamry("Blue", BigDecimal.valueOf(10_000));
        Camry camry2 = carFactory.createCamry("Black", BigDecimal.valueOf(10_000));
        Camry camry3 = carFactory.createCamry("Red", BigDecimal.valueOf(10_000));
        Camry camry4 = carFactory.createCamry("Green", BigDecimal.valueOf(10_000));
        Solara solara = carFactory.createSolara("Black", BigDecimal.valueOf(8_000));
        Dyna dyna = carFactory.createDyna("Yellow", BigDecimal.valueOf(12_000));
        Hiance hiance1 = carFactory.createHiance("White", BigDecimal.valueOf(13_000));
        Hiance hiance2 = carFactory.createHiance("Yellow", BigDecimal.valueOf(13_000));


        Warehouse<Car> carWarehouse = new Warehouse<>();
        carWarehouse.getWareHouse().put(CAMRY, new ArrayList<>());
        carWarehouse.getWareHouse().put(SOLARA, new ArrayList<>());
        carWarehouse.getWareHouse().put(DYNA, new ArrayList<>());
        carWarehouse.getWareHouse().put(HIANCE, new ArrayList<>());
        System.out.println(carWarehouse.getFreeSpace());

        carWarehouse.addCar(CAMRY, camry1);
        carWarehouse.addCar(CAMRY, camry2);
        carWarehouse.addCar(CAMRY, camry3);
        carWarehouse.addCar(CAMRY, camry4);
        carWarehouse.addCar(SOLARA, solara);
        carWarehouse.addCar(DYNA, dyna);
        carWarehouse.addCar(HIANCE, hiance1);
        carWarehouse.addCar(HIANCE, hiance2);

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
