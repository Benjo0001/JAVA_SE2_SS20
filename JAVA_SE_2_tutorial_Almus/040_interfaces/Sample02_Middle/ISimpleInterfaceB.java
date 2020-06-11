/**
 * Very simple sample Interface with two methods and a constant value.
 * This is used as base for all inheriting types.
 */
public interface ISimpleInterfaceB {

    // A static constant
    // Ask yourself: Under which circumstances can I use this?
    public final String InterfaceBGreeting = "Hello from B!";

    // An abstract method which needs to be implemented when inheriting this
    // interface (non static)
    public void MethodB();

    // An abstract method which needs to be implemented when inheriting this
    // interface (non static)
    public void MethodC();
}