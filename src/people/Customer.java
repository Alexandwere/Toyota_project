package people;

import java.math.BigDecimal;

public class Customer {
    private String name;
    private BigDecimal money;

    public Customer(String name, BigDecimal money) {
        this.name = name;
        this.money = money;
    }
}
