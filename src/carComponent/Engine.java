package carComponent;

public class Engine extends Component {

    protected boolean isWorking;

    public Engine(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public boolean isWorking() {
        return isWorking;
    }

}
