package enums;

public enum WheelDiameter {
    DIAMETER_17(17), DIAMETER_16(16), DIAMETER_20(20);
    private double diameter;

    WheelDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }
}
