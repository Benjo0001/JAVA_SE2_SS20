/**
 * Simple implementation for the base interface.
 */
public class SimpleClass implements ISimpleInterface {
    /**
     * Default (non parameterized) constructor for SimpleClass
     */
    public SimpleClass() {
        System.out.println("SimpleClass created! (Default constructor)");
    }

    /**
     * Displays a greeting text in the console.
     */
    public void SayHello() {
        System.out.println(this.Greeting);
    }
}