public class Progression {
    // Instance variable
    protected long current;

    // Constructors
    /**
     * Constructs a progression starting at a given value
     * @param start the starting value
     */
    public Progression(long start) {
        this.current = start;
    }

    /**
     * Constructs a progression starting at zero
     */
    public Progression() {
        this(0);
    }

    // Methods
    /**
     * Returns the next value of the progression
     * @return next value
     */
    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    /**
     * Advances the current value to the next value of the progression
     */
    protected void advance() {
        current++;
    }

    /**
     * Prints the next n values of the progression
     * @param n the number of values to print
     */
    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int i = 1; i < n; i++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}
