package enums;

import java.math.BigDecimal;

public enum PriceCar {
    CAMRY_PRICE(BigDecimal.valueOf(10_000)),
    SOLARA_PRICE(BigDecimal.valueOf(12_000)),
    HIANCE_PRICE(BigDecimal.valueOf(15_000)),
    DYNA_PRICE(BigDecimal.valueOf(22_000));

    private final BigDecimal price;

    PriceCar(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
