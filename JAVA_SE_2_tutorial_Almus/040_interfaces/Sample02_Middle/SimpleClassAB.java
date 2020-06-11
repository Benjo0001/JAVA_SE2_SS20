/**
 * This is a class which inherits from ISimpleInterfaceAB.
 * It has no own methods or attributes.
 */
public class SimpleClassAB implements ISimpleInterfaceAB {

    // Ask yourself: 
    // From which interface is each method inherited?
    // And: 
    // There is one thing a little odd in this inheritance scenario.
    // Can you see what?
    
    // Implementing an inherited method
    public void MethodA()
    {
        System.out.println("Hello from method A in SimpleClassAB!");
    }

    // Implementing an inherited method
    public void MethodB()
    {
        System.out.println("Hello from method B in SimpleClassAB!");
    }

    // Implementing an inherited method
    public void MethodC()
    {
        System.out.println("Hello from method C in SimpleClassAB!");
    }

    // Implementing an inherited method
    public void MethodD()
    {
        System.out.println("Hello from method D in SimpleClassAB!");
    }
}