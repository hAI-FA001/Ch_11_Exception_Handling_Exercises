package Other_Classes;

public class SomeClass {

    public SomeClass() {
        throw new IllegalArgumentException("Threw an exception from " + this.getClass().getSimpleName());
    }
}
