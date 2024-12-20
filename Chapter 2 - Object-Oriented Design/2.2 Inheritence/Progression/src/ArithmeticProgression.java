public class ArithmeticProgression extends Progression {
    // Instance variable
    protected long increment;

    //Constructors
    public ArithmeticProgression(long stepSize, long start) {
        super(start);
        increment = stepSize;
    }

    public ArithmeticProgression(long stepSize) {
        this(stepSize, 0);
    }

    public ArithmeticProgression() {
        this(1, 0);
    }

    @Override
    protected void advance() {
        current += increment;
    }
}
