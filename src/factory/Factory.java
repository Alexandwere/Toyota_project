package factory;

public class Factory {
    public static void CountryCheck(CarFactory factory, PartsFactory factory2) throws CountyFactoryNotEqualException {
        if (!(factory.getCountry().equals(factory2.getCountry()))) {
            throw new CountyFactoryNotEqualException("Производство невозможно, разное нахождение фабрик: "
                    + factory.getCountry().getCountryName() + " и " + factory2.getCountry().getCountryName());
        }
    }

}
