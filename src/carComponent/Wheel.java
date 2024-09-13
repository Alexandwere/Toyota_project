package carComponent;

public class Wheel extends Component {
    protected boolean isCorrect = true;
    protected double diameter;

    public Wheel(double diameter) {
        this.diameter = diameter;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public double getDiameter() {
        return diameter;
    }
}
