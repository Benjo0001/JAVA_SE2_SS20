/**
 * Simple sample Interface with just one method.
 */
public interface IOtherInterface {

    // Ask yourself: 
    // What is different about this method compared to the other two samples?
    // And what does it mean for inheriting classes?
    public default void PrintSomethingOther()
    {
        System.out.println("Printing something other. (IOtherInterface)");
    }
}