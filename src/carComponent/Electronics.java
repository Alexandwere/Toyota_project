package carComponent;

public class Electronics extends Component {

    protected boolean isWorking;

    public Electronics(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public boolean isWorking() {
        return isWorking;
    }


}
