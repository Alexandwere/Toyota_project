package enums;

public enum MaxSpeed {
    CAMRY_MAX_SPEED(200), SOLARA_MAX_SPEED(190), DYNA_MAX_SPEED(140), HIANCE_MAX_SPEED(130);

    private final double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    MaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
