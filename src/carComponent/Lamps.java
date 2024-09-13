package carComponent;

public class Lamps extends Component {

    protected boolean isWorking;

    public Lamps(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public boolean isWorking() {
        return isWorking;
    }
}
