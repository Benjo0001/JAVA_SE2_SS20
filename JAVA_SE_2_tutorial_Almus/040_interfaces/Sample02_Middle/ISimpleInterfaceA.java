/**
 * Very simple sample Interface with two methods and a constant value.
 * This is used as base for all inheriting types.
 */
public interface ISimpleInterfaceA {

    // A static constant
    // Ask yourself: Under which circumstances can I use this?
    public final String InterfaceAGreeting = "Hello from A!";

    // An abstract method which needs to be implemented when inheriting this
    // interface (non static)
    public void MethodA();

    // An abstract method which needs to be implemented when inheriting this
    // interface (non static)
    public void MethodC();
}