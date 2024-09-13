package enums;

public enum Country {
    JAPAN("Япония"),
    SOUTH_KOREA("Южная Корея"),
    RUSSIA("Россия"),
    CHINA("Китай");

    final String countryName;

    private Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
