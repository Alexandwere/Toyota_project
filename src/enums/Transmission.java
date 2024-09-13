package enums;

public enum Transmission {
    AUTOMATIC("Автоматическая"),
    MECHANIC("Механическая"),
    ROBOT("Роботизированная");

    private final String type;

    Transmission(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
