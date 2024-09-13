import car.Car;
import car.cabriolet.Solara;
import carComponent.Wheel;
import enums.WheelDiameter;
import car.cargo.Dyna;
import car.cargo.Hiance;
import car.lightCar.Camry;
import car.StartCarException;
import enums.Country;
import factory.CarFactory;
import factory.CountyFactoryNotEqualException;
import factory.Factory;
import factory.PartsFactory;
import warehouse.NoSpaceException;
import warehouse.Warehouse;

import java.math.BigDecimal;

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
        Hiance hiance = carFactory.createHiance("White", BigDecimal.valueOf(13_000));

        Warehouse<Car> carWarehouse = new Warehouse<>();
        System.out.println(carWarehouse.getFreeSpace());
        carWarehouse.addCar("Camry", camry1);
        carWarehouse.addCar("Camry", camry2);
        carWarehouse.addCar("Hiance", hiance);
        carWarehouse.addCar("Camry", camry3);
        carWarehouse.addCar("Solara", solara);
        carWarehouse.addCar("Camry", camry4);

        System.out.println(carWarehouse.getFreeSpace());
        System.out.println(carWarehouse.getCountCamry());


        System.out.println("________");

        camry1.onLamps();
        solara.coldWater();
        dyna.charge();
        hiance.changeWheel(hiance.getWheel1(), new Wheel(WheelDiameter.DIAMETER_20.getDiameter()));

    }
}
