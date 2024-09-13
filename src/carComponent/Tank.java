package carComponent;

public class Tank extends Component {
    protected double volumeFuel;

    public double getVolumeFuel() {
        return volumeFuel;
    }

    public Tank(double volumeFuel) {
        this.volumeFuel = volumeFuel;
    }

    public boolean isWorking() {
        if (volumeFuel > 0) {
            return true;
        } else return false;
    }
}
