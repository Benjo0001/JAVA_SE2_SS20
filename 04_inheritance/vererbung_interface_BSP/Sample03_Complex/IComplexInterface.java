/**
 * This is a more or less complex sample of an interface.
 * It holds multiple methods (which are declared in different ways).
 * In addition you can find two constants.
 */
public interface IComplexInterface {

    // Ask yourself: 
    // What is the difference between the two constants?
    // What does this mean for inheriting types?
    public static final int MyValue = 0;
    public final String InterfaceGreeting = "Hello from IComplexInterface!";

    // Ask yourself:
    // What is the difference of the following three methods?
    // And what does this mean for types inheriting from this interface?
    public void DoSomething();

    public default void DoSomethingElse()
    {
        System.out.println("I am doing something else in the default way (IComplexInterface).");
    }

    public static void PrintMyTextStatic(String text)
    {
        System.out.println("Your text is: " + text);
    }
}