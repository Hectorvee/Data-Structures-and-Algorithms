/**
 * Interface for objects that can be sold.
 */
public interface Sellable {
    /**
     * Returns a description of the object.
     * @return a description of the object
     */
    String description();

    /**
     * Returns the list price in cents.
     * @return the list price in cents
     */
    int listPrice();

    /**
     * Returns the lowest price in cents that the object can be sold for.
     * @return the lowest price in cents that the object can be sold for
     */
    int lowestPrice();
}
