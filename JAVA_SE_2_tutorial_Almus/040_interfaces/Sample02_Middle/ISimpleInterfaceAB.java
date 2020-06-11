/**
 * Very simple sample Interface.
 * This interface inherits ISimpleInterfaceA and ISimpleInterfaceB.
 * It then adds just one more method.
 */
public interface ISimpleInterfaceAB extends ISimpleInterfaceA, ISimpleInterfaceB {

    // Remember: At this point you're inherting from two interfaces.
    // But since you're writing another interface, not method implementation is needed.
    // You're just "extending"...

    // An abstract method which needs to be implemented when inheriting this
    // interface (non static)
    public void MethodD();
}