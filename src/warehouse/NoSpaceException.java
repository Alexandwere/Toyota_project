package warehouse;

public class NoSpaceException extends Exception {
    public NoSpaceException() {
        System.out.println("Нет свободных мест на складе.");
    }
}
